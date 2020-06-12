package com.example.jpaorm.Repository;

import com.example.jpaorm.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface deptRepository extends JpaRepository<Department, Integer> {


}
