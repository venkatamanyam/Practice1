package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entity.Employee;

public interface Emprepository extends JpaRepository<Employee,Integer> {

}
