package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;

import com.example.demo.service.Empserve;


@RestController
public class Empcont {

	@Autowired
	private Empserve s;
	
	@GetMapping("/sav")
	public ResponseEntity<String> m1()
	{
		          String store = s.store();
		          
		          return new ResponseEntity<String>(store,HttpStatus.OK );
	}
	
	@GetMapping(value= {"/ret"}, produces="application/json")
	public ResponseEntity<Employee> m2()
	{
		         Employee e = s.getEmplo();
		          
		          return new ResponseEntity<Employee>(e,HttpStatus.OK );
	}
	
}
