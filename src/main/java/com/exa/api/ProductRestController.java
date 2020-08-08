package com.exa.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.exa.models.Product;
import com.exa.services.ProductService;

@RestController	
public class ProductRestController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/producting")
	public List<Product> getAllProducts(){
		
		return  productService.getAllProducts();
	}
	
	@GetMapping("/producting/{id}")
	public Product getSingleProduct(@PathVariable("id") String productId){
		
		return  productService.getProductById(productId);
	}
	
}
