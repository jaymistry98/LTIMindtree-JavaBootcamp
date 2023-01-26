package com.pack.mockingpro;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements ToDoService{

	@Override
	public List<String> getTodos(String user) {
		
		return Arrays.asList("core java", "use Hibernate", "use spring");
	}

}
