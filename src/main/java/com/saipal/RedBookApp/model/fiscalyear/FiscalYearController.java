package com.saipal.RedBookApp.model.fiscalyear;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FiscalYearController {

	@Autowired
	private FiscalYearService fiscalYearService;

	@GetMapping("/fiscalYear-list")
	public ModelAndView getFiscalYearList() {
		List<FiscalYear> fiscalYear = fiscalYearService.getAllFiscalYears();
		ModelAndView model = new ModelAndView("fiscalYearList");
		return model.addObject("fiscalYears", fiscalYear);
	}

}
