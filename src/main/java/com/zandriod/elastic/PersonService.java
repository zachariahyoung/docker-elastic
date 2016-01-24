package com.zandriod.elastic;

import org.apache.camel.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Handler
    @Transactional
    public void save(String name){
        Person person = new Person(name);

        personRepository.save(person);
    }
}
