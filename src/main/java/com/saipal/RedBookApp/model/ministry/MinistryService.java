package com.saipal.RedBookApp.model.ministry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MinistryService {
	
	@Autowired
	private MinistryRepository ministryRepository;

	public List<Ministry> getAllMinistries() {
		return ministryRepository.findAll() ;
	}

}
