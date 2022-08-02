package com.example.shoppingcart;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingRepo extends JpaRepository<Shopping, Integer> {
    
}
