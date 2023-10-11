package com.app.fruits;

public class Mango extends Fruits{

	public Mango(String color, double weight, String name) {
		super(color, weight, name);
		// TODO Auto-generated constructor stub
	}

	public Mango() {
		this("",0,"");
	}

	public String taste() {
		return "Sweet";
	}

	public void accept() {
		super.accept();
	}
}
