package com.example.jpaorm.Repository;

import com.example.jpaorm.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface empRepository extends JpaRepository<Employee, Integer> {

}
