package com.example.shoppingcart;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private Integer productId;
	private String productName;
	private Integer qty;
	private double productPrice;
	
	public Cart() {
		
	}
	
	public Cart(Integer id, Integer productId, String productName, double productPrice, Integer qty ) {
		this.id = id;
	    this.productId = productId;
	    this.productName = productName;
	    this.productPrice = productPrice;
	    this.setQty(qty);
	}
	
	public void setId(Integer id){
        this.id = id;
	}
	
	public Integer getId(){
	    return id;
	}
	public void setProductId(Integer productId){
        this.productId = productId;
	}
	
	public Integer getProductId(){
	    return productId;
	}
	public void setProductName(String productName){
        this.productName = productName;
	}
	
	public String getProductName(){
	    return productName;
	}
	
	public void setProductPrice(double productPrice){
	    this.productPrice = productPrice;
	}
	
	public double getProductPrice(){
	    return productPrice;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Integer getQty() {
		return qty;
	}
	@Override
    public String toString() {
            return "Cart [id= " + id + ", productId= " + productId + ", productName= " 
            + productName + ", productPrice= " + productPrice
            + ", qty= " + qty + "]";
    }
	

}
