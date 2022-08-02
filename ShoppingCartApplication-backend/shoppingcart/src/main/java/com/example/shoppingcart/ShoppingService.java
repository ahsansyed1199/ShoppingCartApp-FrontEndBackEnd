package com.example.shoppingcart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingService {
	
	private final ShoppingRepo shoppingRepo;
	
	@Autowired
	public ShoppingService(ShoppingRepo shoppingRepo) {
		this.shoppingRepo = shoppingRepo;
	}
	
	public List<Shopping> findAllProducts(){
		return shoppingRepo.findAll();
	}
	
	public Shopping addProduct(Shopping product) {
		return shoppingRepo.save(product);		
	}
}
