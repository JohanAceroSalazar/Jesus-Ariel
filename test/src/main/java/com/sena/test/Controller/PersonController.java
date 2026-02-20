//Maneja peticiones HTTP
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
import com.sena.test.Entity.Person;
import com.sena.test.Service.IPersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private IPersonService service;

    @GetMapping("")
    public ResponseEntity<Object> findAll(){
        return new ResponseEntity<Object>
        (service.findAll(),HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Object> findById(
        @PathVariable int id){
            Person person = service.findById(id);
            return new ResponseEntity<Object>
            (person,HttpStatus.OK);
    }

    @GetMapping("filterByAge/{edad}")
    public ResponseEntity<Object> filterByEdad(
        @PathVariable int edad){
            List<Person> person = service.filterByEdad(edad);
            return new ResponseEntity<Object>
            (person,HttpStatus.OK);
        }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> delete(
        @PathVariable int id){
            service.delete(id);
            return new ResponseEntity<Object>
            ("Se elimino correctamente",HttpStatus.OK);
        }
}