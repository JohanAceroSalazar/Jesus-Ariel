package com.sena.test.Service.Imple;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.test.Entity.User;
import com.sena.test.IRepository.UserRepository;
import com.sena.test.Service.IUserService;

@Service
public class UserServiceImple implements IUserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override 
    public User findById(int id){
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<User> filterByName(String user_name){
        return repository.filterByName(user_name);
    }

    @Override
    public String delete(int id){
        repository.deleteById(id);
        return null;
    }
}