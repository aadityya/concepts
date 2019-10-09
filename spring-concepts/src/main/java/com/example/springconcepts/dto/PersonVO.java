package com.example.springconcepts.dto;


public class PersonVO {

    private Long id;
    private String name;

    public PersonVO(Long id, String name) {
        this.id = id;
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
