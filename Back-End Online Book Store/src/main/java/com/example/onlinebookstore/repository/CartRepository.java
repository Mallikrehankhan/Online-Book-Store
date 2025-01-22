package com.example.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onlinebookstore.entity.Cart;
import com.example.onlinebookstore.entity.User;


	@Repository
	public interface CartRepository extends JpaRepository<Cart, Long> {
		
		void deleteCartByUser(User u);
	
}
