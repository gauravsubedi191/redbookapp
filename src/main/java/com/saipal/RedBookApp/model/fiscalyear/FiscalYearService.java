package com.saipal.RedBookApp.model.fiscalyear;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FiscalYearService {
	
	@Autowired
	private FiscalYearRepository fiscalYearRepository; 

	public List<FiscalYear> getAllFiscalYears() {
		return fiscalYearRepository.findAll() ;
	}

}
