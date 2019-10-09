package com.example.springconcepts.service;

import com.example.springconcepts.dao.entity.Person;
import com.example.springconcepts.dao.repository.PersonRepository;
import com.example.springconcepts.dto.PersonVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepo;

    public void save(PersonVO personVO) {
        Person person = new Person();
        person.setName(personVO.getName());

        personRepo.save(person);

    }
}
