package com.sena.test.Service;

import java.util.List;
import com.sena.test.Entity.User_Role;

public interface IUser_RoleService {

    public List<User_Role> findAll();
    public User_Role findById(int id);
    public List<User_Role> filterById(int id);
    public String delete(int id);
}