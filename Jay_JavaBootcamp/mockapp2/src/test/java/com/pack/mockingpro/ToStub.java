package com.pack.mockingpro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ToStub {

	@Test
	public void test() {
		ToDoService doService = new ToDoServiceStub();
		ToDoBusiness business = new ToDoBusiness(doService);

		List<String> rtd = business.getTodosforHB("Hibernate");

		assertEquals(1, rtd.size());
	}
}
