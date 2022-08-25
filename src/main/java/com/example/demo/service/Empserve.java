package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Address;
import com.example.demo.entity.Employee;
import com.example.demo.repository.Emprepository;

@Service
public class Empserve {
   
	@Autowired
	private Emprepository repo;
	
    public String store() {
		
    	Employee e=new Employee();
    	
    	e.setName("sai");
    	e.setSal(20000d);
    	
    	Address a=new Address();
    	
    	   a.setStreet("Apet");
    	   a.setCity("Hyd");
    	   a.setState("Ts");
    	   a.setEmpl(e);
    	   
    	   
    	   Address a2=new Address();
       	
    	   a2.setStreet("Mhalli");
    	   a2.setCity("Bng");
    	   a2.setState("Ka");
    	   a2.setEmpl(e);
    	   
    	   
    	   List<Address> la=Arrays.asList(a,a2);
    	   
    	   
    	   e.setL(la);
    	   repo.save(e);
    	   
    	   
		
		return "success";
		
	}
    
    
    public Employee getEmplo()
    {
    	Employee em = repo.findById(1).get();
    	
    	return em;
    	
    	
    }
	
}
