package nl.yacht.molvenorestaurant.controller;


import nl.yacht.molvenorestaurant.model.Person;
import nl.yacht.molvenorestaurant.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("api/persons")
public class PersonController {

    @Value("${firstName}")
    private String voornaam;


    @Autowired
    private PersonRepository personRepository;


    @PostConstruct
    public void someData() {
        for(int i = 0;i<3;i++) {
            Person one = new Person("Raymond", "Loman", Double.valueOf(Math.random()*3000).intValue());
            this.personRepository.save(one);
        }
    }

    @GetMapping
    public Iterable<Person> findAll() {

        final boolean demo = false;

        Iterable<Person> persons = this.personRepository.findAll();

        if (demo) {
            for (Person p : persons) {
                p.setFirstName(this.voornaam);
            }
        }


        return persons;
    }

    @GetMapping(value = "{id}")
    public Person findById(@PathVariable long id) {
        return this.personRepository.findById(id);
    }

    @PutMapping(value = "{id}")
    public Person update(@PathVariable long id, @RequestBody Person input) {

        return this.personRepository.update(id, input);

    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable long id) {
        this.personRepository.delete(id);
    }

    @PostMapping
    public Person save(@RequestBody Person person) {

        return this.personRepository.save(person);
    }
}