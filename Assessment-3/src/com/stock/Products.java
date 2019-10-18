package com.stock;

public class Products {
	private int id;
	private String name;
	private int rate;
	
	Products(int id,String name,int rate) {
		this.id=id;
		this.name=name;
		this.rate=rate;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
		
}
