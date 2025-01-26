package com.saipal.RedBookApp.model.economicCode;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EconomicCodeService {

	@Autowired
	private EconomicCodeRepository economicCodeRepository;
	
	public List<EconomicCode> getAllEconomicCodes() {
		return economicCodeRepository.findAll();
	}

}
