package com.saipal.RedBookApp.model.funding;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FundingMethodController {

	@Autowired
	private FundingService fundingService;

	@GetMapping("/fundingMethod-list")
	public ModelAndView getAllFundingMethods() {
		
		List<FundingMethod> fundingMethod= fundingService.getAllFundingMethods();
		ModelAndView model = new ModelAndView("fundingMethod_list");
		model.addObject("fundingMethods",fundingMethod);
		return model;
	}
}
