package com.project.ems.jobdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ems.jobdetails.domain.CandidateDetailsDomain;
import com.project.ems.jobdetails.repository.CandidateDetailsRepo;

@Service
public class CandidateDetailsService {
	@Autowired
	private CandidateDetailsRepo repo;
	
	public List<CandidateDetailsDomain> listAll()
	{
		return repo.findAll();
	}
	public void save(CandidateDetailsDomain candidatedetails) {
		repo.save(candidatedetails);
	}
	
	public CandidateDetailsDomain get(long cno) {
		return repo.findById(cno).get();
	}
	public void delete(long cno)
	{
		repo.deleteById(cno);
	}
}
