package com.nagarro.nagp.repo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.nagarro.nagp.model.Order;

@Repository
public class OrderRepo {
	
	List<Order> orders = new ArrayList<Order>() {{
		
		add(new Order("1",1,2000.00,LocalDate.of(2020, 02, 07)));
		add(new Order("2",1,3000.00,LocalDate.of(2020, 03, 07)));
		add(new Order("3",1,4000.00,LocalDate.of(2020, 03, 17)));
		
		add(new Order("1",2,1000.00,LocalDate.of(2020, 02, 07)));
		
	}};

	
	public void addOrder(Order order) {
		this.orders.add(order);
		
	}

	public List<Order> getAllOrders() {
		return this.orders;
	}
	
	public List<Order> getOrderByUserId(Integer userId) {

		return this.orders.stream().filter(order -> order.getUserId().equals(userId))
				.collect(Collectors.toList());

	}
	
	public List<Order> getOrderByOrderId(String orderId) {

		return this.orders.stream().filter(order -> order.getOrderId().equals(orderId))
				.collect(Collectors.toList());

	}
	
	public void deleteOrder(Order order) {
		 this.orders.remove(order);
	}
}
