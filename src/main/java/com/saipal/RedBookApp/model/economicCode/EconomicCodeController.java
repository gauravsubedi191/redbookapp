package com.saipal.RedBookApp.model.economicCode;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EconomicCodeController {

	@Autowired
	private EconomicCodeService economicCodeService;

	@GetMapping("/economicCode-list")
	public ModelAndView getAllEconomicCodes() {
		List<EconomicCode> economicCode = economicCodeService.getAllEconomicCodes();
		ModelAndView model = new ModelAndView("economicCode_list");
		model.addObject("economicCodes", economicCode);
		return model;
	}
}
