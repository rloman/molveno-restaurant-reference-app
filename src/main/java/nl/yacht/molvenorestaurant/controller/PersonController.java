package nl.yacht.molvenorestaurant.controller;


import nl.yacht.molvenorestaurant.model.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/persons")
public class PersonController {


    @GetMapping
    public Person getAll() {

        Person result = new Person("Wouter", "Dekker", 1988);

        return result;
    }

    @PostMapping
    public void save(@RequestBody Person person) {
        System.err.println(person.getFirstName());
        System.err.println(person.getLastName());
        System.err.println(person.getYearOfBirth());
    }
}
