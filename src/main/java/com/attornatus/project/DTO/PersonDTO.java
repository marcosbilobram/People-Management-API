package com.attornatus.project.DTO;

import com.attornatus.project.entities.Adress;
import com.attornatus.project.entities.Person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonDTO {

    private Long id;
    private String name; // Nome
    private Date birthDay; // Data de nascimento

    private List<Adress> adresses = new ArrayList<>(); // Endereços

    public PersonDTO(Person person){
        id = person.getId();
        name = person.getName();
        birthDay = person.getBirthDay();
        adresses = person.getAdresses();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public List<Adress> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<Adress> adresses) {
        this.adresses = adresses;
    }
}