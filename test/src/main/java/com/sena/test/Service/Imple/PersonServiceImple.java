package com.sena.test.Service.Imple;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.test.Entity.Person;
import com.sena.test.IRepository.PersonRepository;
import com.sena.test.Service.IPersonService;

@Service
public class PersonServiceImple implements IPersonService {

    @Autowired
    private PersonRepository repo;

    @Override
    public List<Person> findAll(){
        return repo.findAll();
    }

    @Override
    public Person findById(int id){
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Person> filterByEdad(int edad){
        return repo.filterByEdad(edad);
    }

    @Override
    public String delete(int id){
        repo.deleteById(id);
        return null;
    }
}