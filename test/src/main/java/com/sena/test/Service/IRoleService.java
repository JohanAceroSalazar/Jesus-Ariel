package com.sena.test.Service;

import java.util.List;
import com.sena.test.Entity.Role;

public interface IRoleService {

    public List<Role> findAll();
    public Role findById(int id_role);
    public List<Role> findByRole(String role);
    public String delete(int id);
}