package com.pack.mockingpro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ToDoServiceMock {

	@Test
	public void performTest() {
		ToDoService doService = Mockito.mock(ToDoService.class);

		List<String> clist = Arrays.asList("core java", "use Hibernate", "use Spring");

		Mockito.when(doService.getTodos("dummy")).thenReturn(clist);

		ToDoBusiness business = new ToDoBusiness(doService);

		List<String> altd = business.getTodosforHB("dummy");

		assertEquals(1, altd.size());
	}
}
