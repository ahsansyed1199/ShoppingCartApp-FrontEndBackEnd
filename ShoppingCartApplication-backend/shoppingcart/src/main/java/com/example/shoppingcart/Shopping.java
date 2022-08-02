package com.example.shoppingcart;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Entity 
public class Shopping implements Serializable {

        @Id     
        @GeneratedValue(strategy = GenerationType.IDENTITY)        
        
        private Integer id;        
        private String name;       
        private double price;        
        private String description;        
        private String imageUrl;
        
        public Shopping() {
                 
        }
        public Shopping(Integer id, String productName, double productPrice, 
                String productDescription, String imageUrl) {
                        
                this.id = id;
                this.name = productName;
                this.price = productPrice;
                this.description = productDescription;
                this.imageUrl = imageUrl;
        }

        public void setId(Integer id){
                this.id = id;
        }

        public Integer getId(){
                return id;
        }
        public void setProductName(String productName){
                this.name = productName;
        }

        public String getProductName(){
                return name;
        }

        public void setProductPrice(double productPrice){
                this.price = productPrice;
        }

        public double getProductPrice(){
                return price;
        }

        public void setproductDescription(String productDescription){
                this.description = productDescription;
        }

        public String getProductDescription(){
                return description;
        }

        public void setimageUrl(String imageUrl){
                this.imageUrl = imageUrl;
        }

        public String getImageUrl(){
                return imageUrl;
        }

        @Override
        public String toString() {
                return "Shopping [id= " + id + ", imageUrl= " + imageUrl + ", productDescription= " 
                + description + ", productName= " + name
                + ", productPrice= " + price + "]";
        }

}
