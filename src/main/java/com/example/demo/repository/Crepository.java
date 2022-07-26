package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Captain;

public interface Crepository extends JpaRepository<Captain,Integer>{

}
