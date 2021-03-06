package com.exa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exa.services.ProductService;

@Controller	
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductService productService;
	@GetMapping("/all")
	public String getAllProducts( Model model) {
		
		model.addAttribute("products", productService.getAllProducts());
		return "product_all";
	}
}
