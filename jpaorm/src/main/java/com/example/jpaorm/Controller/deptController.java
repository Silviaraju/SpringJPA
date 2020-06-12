package com.example.jpaorm.Controller;

import com.example.jpaorm.Model.Department;
import com.example.jpaorm.Repository.deptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/dept")
public class deptController {

    @Autowired
    private deptRepository deptRepository;

    @PostMapping(value="/save")
    public String saveDept(@RequestBody Department department){
        deptRepository.save(department);
        return "department saved";

    }

}
