package nl.yacht.molvenorestaurant.config;

import com.github.javafaker.Faker;
import nl.yacht.molvenorestaurant.model.Person;
import nl.yacht.molvenorestaurant.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Component
public class DataInitialiser {

    @Autowired
    private PersonRepository personRepository;

    @PostConstruct
    public void someData() {
        Faker faker = new Faker();
        for(int i = 0;i<5;i++) {
            Person one = new Person(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1968, LocalDate.now().getYear()));
            this.personRepository.save(one);
        }
    }
}
