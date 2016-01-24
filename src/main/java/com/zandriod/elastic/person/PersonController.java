package com.zandriod.elastic.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @RequestMapping("/person")
    public ResponseEntity<Person> getPerson(){

        Person one = personRepository.findOne("AVJ1mrY4K3f-ZbpPjr9e");

        return new ResponseEntity<>(one, HttpStatus.OK);
    }
}