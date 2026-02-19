package com.sena.test.Service.Imple;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.test.Entity.Role;
import com.sena.test.IRepository.RoleRepository;
import com.sena.test.Service.IRoleService;

@Service
public class RoleServiceImple implements IRoleService {

    @Autowired
    private RoleRepository repo;

    @Override
    public List<Role> findAll(){
        return repo.findAll();
    }

    @Override
    public Role findById(int id_role){
        return repo.findById(id_role).orElse(null);
    }

    @Override
    public List<Role> findByRole(String role){
        return repo.filterByRole(role);
    }

    @Override
    public String delete(int id){
        repo.deleteById(id);
        return null;
    }
}