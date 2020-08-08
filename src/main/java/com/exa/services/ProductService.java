package com.exa.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.exa.models.Product;

@Service
public class ProductService {

		public List<Product> getAllProducts(){
			List<Product> listOfProducts = new ArrayList<>();
			
			listOfProducts.add(new Product("123","I Phone 10","Better than last one",999,"Apple"));
			listOfProducts.add(new Product("124","Galaxy M 30","Camera bad",200,"Samsung"));
			listOfProducts.add(new Product("125","Realme 5 pro","Nyc featurees foor this price",180,"Oppo"));
			return listOfProducts;
		}
		
		public Product getProductById(String id) {
			Predicate<Product> byId = p -> p.getId().equals(id);
			return filterProducts(byId);
		}
		public Product filterProducts(Predicate<Product> strategy) {
			return getAllProducts().stream().filter(strategy).findFirst().orElse(null);
		}
}
