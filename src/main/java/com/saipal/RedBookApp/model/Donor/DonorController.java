package com.saipal.RedBookApp.model.Donor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DonorController {

	@Autowired
	private DonorService donorService;

	@GetMapping("/donor-list")
	public ModelAndView getDonorList() {
		List<Donor> donor = donorService.getAllDonors();
		ModelAndView model = new ModelAndView("donor_list");
		model.addObject("donors", donor);
		return model;

	}

}
