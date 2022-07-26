package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Captain;
import com.example.demo.entity.Team;
import com.example.demo.repository.Crepository;
import com.example.demo.repository.Trepository;

@Service
public class Tserve {
   
	@Autowired
	private Trepository repo;
	@Autowired
	private Crepository crepo;
    public String store() {
		
    	Team t=new Team();
		t.setName("M");
		
		Captain c=new Captain();
		c.setCname("Rohit");
		c.setTea(t);
		
		t.setC(c);
		repo.save(t);
		return "success";
		
	}
    
    
    public Team getTeam()
    {
    	
    	Team team = repo.findById(2).get();
    	System.out.println(team.getName());
    	return team;
    	
    	
    }
	
}
