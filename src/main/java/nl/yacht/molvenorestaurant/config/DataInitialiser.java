package nl.yacht.molvenorestaurant.config;

import nl.yacht.molvenorestaurant.model.Person;
import nl.yacht.molvenorestaurant.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataInitialiser {

    @Autowired
    private PersonRepository personRepository;

    @PostConstruct
    public void someData() {
        for(int i = 0;i<30;i++) {
            char c = (char) (i+65);
            Person one = new Person(c+"Jan", c+"Willemsen", Double.valueOf(Math.random()*3000).intValue());
            this.personRepository.save(one);
        }
    }
}
