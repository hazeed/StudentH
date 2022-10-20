package com.acheiversit.controller;

import com.acheiversit.dto.StudentDTO;
import com.acheiversit.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentRepository repository;

    @GetMapping( value ="/get/{id}")
    public StudentDTO get(@PathVariable("id") int id){
        return repository.get(id);
    }
    @PostMapping("/create")
    public void saveStudent(@RequestBody StudentDTO s){
        repository.addStudent(s);
    }


    @PutMapping("/update")
    public void updateStudent(@RequestBody StudentDTO s){
        repository.updateStudent(s);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable("id") int id){
        repository.deleteStudent(id);
    }

}