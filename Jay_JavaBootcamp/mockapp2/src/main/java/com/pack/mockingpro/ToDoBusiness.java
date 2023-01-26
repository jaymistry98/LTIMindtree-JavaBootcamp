package com.pack.mockingpro;

import java.util.ArrayList;
import java.util.List;

public class ToDoBusiness {
	
	public ToDoService service;

	public ToDoBusiness(ToDoService service) {
		
		this.service = service;
	}
	
	public List<String> getTodosforHB (String user){
		List<String> hlist = new ArrayList<String>();
		List<String> clist = service.getTodos(user);
		for(String todo: clist) {
			if(todo.contains("Hibernate")) {
				hlist.add(todo);
			}
		}
		return hlist;
	}
}
