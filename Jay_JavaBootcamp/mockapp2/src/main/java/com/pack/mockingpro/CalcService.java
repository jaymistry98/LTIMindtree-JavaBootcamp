package com.pack.mockingpro;

public class CalcService {
	
	private AddService addService;

	public CalcService(AddService addService) {
		super();
		this.addService = addService;
	}
	
	public int calc(int a,int b) {
		return addService.add(a, b);
	}

}
