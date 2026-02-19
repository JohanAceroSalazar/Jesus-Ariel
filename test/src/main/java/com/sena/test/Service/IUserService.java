package com.sena.test.Service;

import java.util.List;
import com.sena.test.Entity.User;

public interface IUserService {

    public List<User> findAll();
    public User findById(int id);
    public List<User> filterByName(String user_name);
    public String delete(int id);
}