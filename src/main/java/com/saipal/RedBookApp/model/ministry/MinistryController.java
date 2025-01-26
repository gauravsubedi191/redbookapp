package com.saipal.RedBookApp.model.ministry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class MinistryController {

	@Autowired
	private MinistryService ministryService;
	
	@GetMapping("ministry-list")
	public ModelAndView getAllMinistry() {
		List<Ministry> ministry= ministryService.getAllMinistries();
		ModelAndView model = new ModelAndView("ministry_list");
		model.addObject("ministries", ministry);
		return model;
	}
	
}
