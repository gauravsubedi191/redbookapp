package com.saipal.RedBookApp.model.funding;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FundingService {

	@Autowired
	private FundingMethodRepository fundingMethodRepository;

	public List<FundingMethod> getAllFundingMethods() {
		return fundingMethodRepository.findAll();
	}
}
