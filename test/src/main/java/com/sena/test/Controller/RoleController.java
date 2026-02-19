package com.sena.test.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sena.test.Entity.Role;
import com.sena.test.Service.IRoleService;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private IRoleService service;

    @GetMapping("")
    public ResponseEntity<Object> findAll(){
        return new ResponseEntity<Object>(
            service.findAll(),HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Object> findById(
        @PathVariable int id){
            Role role = service.findById(id);
            return new ResponseEntity<Object>
            (role,HttpStatus.OK);
        }

    @GetMapping("findByRole/{role}")
    public ResponseEntity<Object>findByRole(
        @PathVariable String role){
            List<Role> rol=service.findByRole(role);
            return new ResponseEntity<Object>
            (rol,HttpStatus.OK);
        }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> delete(
        @PathVariable int id){
            service.delete(id);
            return new ResponseEntity<Object>
            ("Se elimino correctamente",HttpStatus.OK);
        }
}