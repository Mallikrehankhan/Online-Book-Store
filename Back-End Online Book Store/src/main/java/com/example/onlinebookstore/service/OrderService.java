package com.example.onlinebookstore.service;

import java.util.List;

import com.example.onlinebookstore.entity.Order;
import com.example.onlinebookstore.entity.TransactionDetails;


public interface OrderService {
	
		Order addOrder(Order order, long userId, long cartId);

		Order getOrderById(long orderId);

		Order updateOrder(Order order, long orderId);

		List<Order> getOrderByUserId(long userId);

		//List<Order> getAllOrders();

		// List<Order> getAllOrdersByCartId(long cartId);
		
		Order addOrderItem(Order order,long userId);
		
		void deleteOrder(long orderId);
		
		TransactionDetails createTransaction(Double amount);

		List<Order> getAllOrders();
	
}
