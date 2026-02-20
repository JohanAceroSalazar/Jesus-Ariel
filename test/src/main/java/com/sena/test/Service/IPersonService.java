package com.sena.test.Service;

import java.util.List;

import com.sena.test.Dto.PersonDto;
import com.sena.test.Entity.Person;

public interface IPersonService {

    public List<Person>findAll();
    public Person findById(int id);
    public List<Person> filterByEdad(int edad);
    public String save(PersonDto p);
    public String delete(int id);
}