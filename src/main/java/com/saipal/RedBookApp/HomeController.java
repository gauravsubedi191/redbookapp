package com.saipal.RedBookApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

	@GetMapping("/")
	public ModelAndView welcomeToHomePage() {
		return new ModelAndView("home_page");
	}
}
