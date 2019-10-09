package com.example.springconcepts.api;

import com.example.springconcepts.dto.PersonVO;
import com.example.springconcepts.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class PersonHandler {

    @Autowired
    PersonService personService;

    public PersonService getPersonService() {
        return personService;
    }

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    public void save(PersonVO person) {
        personService.save(person);
    }
}
