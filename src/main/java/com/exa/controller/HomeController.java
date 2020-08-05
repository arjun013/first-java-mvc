package com.exa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("home")
	public String showHomePage() {
		System.out.println("in home page");
		return "home";
	}
}
