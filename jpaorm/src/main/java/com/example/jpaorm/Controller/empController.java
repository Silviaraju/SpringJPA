package com.example.jpaorm.Controller;

import com.example.jpaorm.Model.Employee;
import com.example.jpaorm.Repository.empRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/emp")
public class empController {

    @Autowired
    private empRepository empRepository;

    @PostMapping(value="/save")
    public String saveEmp(@RequestBody Employee employee){
    empRepository.save(employee);
    return "employee saved";
    }

    @GetMapping(value="/getAllEmp")
    public List<Employee> getAllEmployees(){
        return empRepository.findAll();
    }

    @GetMapping(value="/getemp/{id}")
    public Optional<Employee> getEmployee(@PathVariable Integer id){
       return empRepository.findById(id);
    }

    @GetMapping(value="/remove/{id}")
    public String removeEmployee(@PathVariable Integer id){
        empRepository.deleteById(id);
        return "Employee record deleted successfully";
    }
}
