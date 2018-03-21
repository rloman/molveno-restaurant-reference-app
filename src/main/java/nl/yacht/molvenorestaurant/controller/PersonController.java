package nl.yacht.molvenorestaurant.controller;


import nl.yacht.molvenorestaurant.model.Person;
import nl.yacht.molvenorestaurant.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/persons")
public class PersonController {


    @Autowired
    private PersonRepository personRepository;


    @GetMapping
    public Iterable<Person> findAll() {

        Iterable<Person> persons = this.personRepository.findAll();

        return persons;
    }

    @GetMapping(value="{id}")
    public Person findById(@PathVariable long id){
        return this.personRepository.findById(id);
    }

    @PutMapping(value="{id}")
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