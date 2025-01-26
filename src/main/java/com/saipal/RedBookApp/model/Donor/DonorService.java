package com.saipal.RedBookApp.model.Donor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonorService {
	
	@Autowired
	private DonorRepository donorRepository;
	
	public List<Donor> getAllDonors(){
		return donorRepository.findAll();
	}
}
