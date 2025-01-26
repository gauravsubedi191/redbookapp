package com.saipal.RedBookApp.model.province;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ProvinceController {

	@Autowired
	private ProvinceService provinceService;

	@GetMapping("/province-list")
	public ModelAndView getMethodName() {
		List<Province> province = provinceService.getAllProvinces();
		ModelAndView model = new ModelAndView("province_list");
		model.addObject("provinces", province);
		return model;
	}

}
