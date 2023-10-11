package com.app.fruits;

public class Orange extends Fruits {

	public Orange() {
		this("", 0, "");
	}

	public Orange(String color, double weight, String name) {
		super(color, weight, name);
		// TODO Auto-generated constructor stub
	}

	public String taste() {
		return "Sour";
	}

	public void accept() {
		super.accept();
	}
	
	

}
