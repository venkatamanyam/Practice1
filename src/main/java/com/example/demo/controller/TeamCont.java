package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Team;
import com.example.demo.service.Tserve;

@RestController
public class TeamCont {
	
	@Autowired
	private Tserve t;
	
	@GetMapping("/come")
	public ResponseEntity<String> m1()
	{
		          String store = t.store();
		          
		          return new ResponseEntity<String>(store,HttpStatus.OK );
	}

	@GetMapping(value= {"/com"}, produces="application/json")
	public ResponseEntity<Team> m2()
	{
		         Team team = t.getTeam();
		          
		          return new ResponseEntity<Team>(team,HttpStatus.OK );
	}
}
