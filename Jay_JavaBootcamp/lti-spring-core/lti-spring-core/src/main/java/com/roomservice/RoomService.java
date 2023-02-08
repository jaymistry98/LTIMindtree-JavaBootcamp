package com.roomservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.cleaning.CleaningService;
import com.restaurant.Restaurant;

@Service(value = "service")
public class RoomService {
	
	//@Autowired
	private Restaurant restaurant;
	
	@Autowired
	//private CleaningService cleaningService;
	/*
	public RoomService(CleaningService cleaningService) {
		super();
		this.cleaningService = cleaningService;
	}
	*/
	public RoomService(Restaurant restaurant) {
		super();
		this.restaurant = restaurant;
		System.out.println("Inside RoomService");
	}
	/*
	public String requestCleaing(int roomNumber){
		return cleaningService.clean(roomNumber);
	}
	*/
	public String placeOrder(String orderName) {
		return restaurant.prepareDish(orderName);
	}
	
	public void init() {
		System.out.println("Bean initialized");
	}
	
	public void destroy() {
		System.out.println("Bean destroyed");
	}
	
}
