package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity

public class Team implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	
	
	private String name;
	
	
	@OneToOne(mappedBy="tea", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Captain c;
	
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Captain getC() {
		return c;
	}
	

	public void setC(Captain c) {
		this.c = c;
	}
}
