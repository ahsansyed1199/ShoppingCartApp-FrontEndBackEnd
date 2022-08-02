package com.example.shoppingcart;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopping")
@CrossOrigin
public class CartController {
    private final CartService cartServ;
	
    public CartController(CartService cartServ) {
    	this.cartServ = cartServ;
    }
    
    
	@GetMapping("/cart")
	public ResponseEntity<List<Cart>> getProducts() {
		List<Cart> cartProducts =  cartServ.findAllCartProducts();
		return new ResponseEntity<>(cartProducts, HttpStatus.OK);
	}
	
	@PostMapping("/addCart")
	public ResponseEntity<Cart> addProduct(@RequestBody Cart product){
		Cart newCartProduct = cartServ.addProductToCart(product);
		return new ResponseEntity<>(newCartProduct, HttpStatus.CREATED);
	}
}
