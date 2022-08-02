package com.example.shoppingcart;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoppingcart.Shopping;
import com.example.shoppingcart.ShoppingRepo;

@RestController
@RequestMapping("/shopping")
@CrossOrigin
public class ShoppingController {
    private final ShoppingService shoppingServ;
	
    public ShoppingController(ShoppingService shoppingServ) {
    	this.shoppingServ = shoppingServ;
    }
    
    
	@GetMapping("/getProducts")
	public ResponseEntity<List<Shopping>> getProducts() {
		List<Shopping> products =  shoppingServ.findAllProducts();
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Shopping> addProduct(@RequestBody Shopping product){
		Shopping newProduct = shoppingServ.addProduct(product);
		return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
	}
}
