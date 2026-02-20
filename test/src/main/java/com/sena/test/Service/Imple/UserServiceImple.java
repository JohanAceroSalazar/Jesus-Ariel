package com.sena.test.Service.Imple;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.test.Dto.UserDto;
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

    public User dtoToEntity(UserDto UserDto){
        return new User(
            UserDto.getId(),
            UserDto.getUser_name(),
            UserDto.getEmail(),
            UserDto.getPassword()
        );
    }

    public User entityToDto(User user){
        return new User(
            user.getId(),
            user.getUser_name(),
            user.getEmail(),
            user.getPassword()
        );
    }

    @Override
    public String save(UserDto userDto){
        User user = dtoToEntity(userDto);
        repository.save(user);
        return "User guardado correctamente";
    }

    @Override
    public String delete(int id){
        repository.deleteById(id);
        return null;
    }
}