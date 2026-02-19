package com.sena.test.Service.Imple;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.test.Entity.User_Role;
import com.sena.test.IRepository.User_RoleRepository;
import com.sena.test.Service.IUser_RoleService;

@Service
public class User_RoleServiceImple implements IUser_RoleService{

    @Autowired
    private User_RoleRepository repo;

    @Override
    public List<User_Role> findAll(){
        return repo.findAll();
    }

    @Override
    public User_Role findById(int id){
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<User_Role> filterById(int id){
        return repo.filterById(id);
    }

    @Override
    public String delete(int id){
        repo.deleteById(id);
        return null;
    } 
}