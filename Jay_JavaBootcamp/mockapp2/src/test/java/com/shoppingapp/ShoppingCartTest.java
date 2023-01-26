package com.shoppingapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.*;

public class ShoppingCartTest {
	
	@Mock
	private static ShoppingCart cart;

	@BeforeEach
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@BeforeAll
	public static void callBeforeAll() {
		cart = new ShoppingCart();
	}
	
	@Test
	public void testAdd() {
		Product p1 = Mockito.mock(Product.class);
		Product p2 = Mockito.mock(Product.class);
		
		p1 = new Product("book", 20);
		p2 = new Product("mobile", 445);
		cart.addItem(p1);
		cart.addItem(p2);
		
		Mockito.verify(cart).addItem(p1);
		Mockito.verify(cart).addItem(p2);
		
		Mockito.when(cart.getItemCount()).thenReturn(2);
		
		assertEquals(2, cart.getItemCount());
	}
	
	
}
