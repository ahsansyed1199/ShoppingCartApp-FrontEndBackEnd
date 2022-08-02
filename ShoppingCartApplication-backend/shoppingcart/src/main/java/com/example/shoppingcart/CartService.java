package com.example.shoppingcart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService  {

	private final CartRepo cartRepo;
	
	@Autowired
	public CartService(CartRepo cartRepo) {
		this.cartRepo = cartRepo;
	}
	
	public List<Cart> findAllCartProducts(){
		return cartRepo.findAll();
	}
	
	public Cart addProductToCart(Cart cartitem) {
		return cartRepo.save(cartitem);		
	}
	
}
