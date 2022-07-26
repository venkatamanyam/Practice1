package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity

public class Captain implements Serializable{
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int caid;
	
	private String cname;
	
	
	
	@JsonIgnore
	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn( name="cid")
	private Team tea;
	
	
	
	
	
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Team getTea() {
		return tea;
	}
	public void setTea(Team tea) {
		this.tea = tea;
	}
	
	public int getCaid() {
		return caid;
	}
	public void setCaid(int caid) {
		this.caid = caid;
	}
	
}
