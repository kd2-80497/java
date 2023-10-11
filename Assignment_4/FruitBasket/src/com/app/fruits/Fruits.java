package com.app.fruits;

import java.util.Scanner;

public class Fruits {

	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	


	public Fruits() {
		this("", 0, "");
	}

	public Fruits(String color, double weight, String name) {

		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh=isFresh;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	



	@Override
	public String toString() {
		return "Fruits [color=" + color + ", weight=" + weight + ", name=" + name + "]";
	}

	public String taste() {

		return "NO SPECIFIC TASTE....";

	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER COLOR OF FRUIT..");
		color = sc.next();
		System.out.println("ENTER weight OF FRUIT..");
		weight = sc.nextDouble();
		System.out.println("ENTER name OF FRUIT..");
		name = sc.next();
		this.isFresh=true;
      
	}
	public boolean isFresh() {
		if(isFresh) {
			return true;
		}
		return false;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	


}
