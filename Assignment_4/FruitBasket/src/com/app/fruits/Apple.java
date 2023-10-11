package com.app.fruits;

public class Apple extends Fruits {

	public Apple() {

		this("",0,"");
	}

	public Apple(String color, double weight, String name) {
		super(color, weight, name);
		// TODO Auto-generated constructor stub
	}
	
	public  String taste() {
		return "Sweet n Sour";
	}
	public void accept() {
		super.accept();
	}
	
	
	

}
