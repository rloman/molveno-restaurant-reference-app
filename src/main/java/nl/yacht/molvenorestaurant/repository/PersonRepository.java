package nl.yacht.molvenorestaurant.repository;

import nl.yacht.molvenorestaurant.model.Person;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PersonRepository {

    private static long counter = 0;
    private Map<Long, Person> people = new HashMap<>();

    public Iterable<Person> findAll() {
        Iterable<Person> result = this.people.values();

        return result;
    }

    public Person save(Person personToBeSaved) {

        counter++;
        this.people.put(counter, personToBeSaved);
        personToBeSaved.setId(counter);
        Person savedPerson = this.people.get(counter);

        return savedPerson;
    }

    public Person update(long id, Person input) {

        Person output = this.people.get(id);

        output.setFirstName(input.getFirstName());
        output.setLastName(input.getLastName());
        output.setYearOfBirth(input.getYearOfBirth());

        // and so on ... if you have more fields

        return output;
    }

    public void delete(long id) {
        this.people.remove(id);
    }

    public Person findById(long id) {

        Person result = this.people.get(id);
        return result;
    }
}