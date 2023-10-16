package com.ojaswi;

import java.util.Scanner;

public class Person implements Displayable {
	private String fname;
	private String lname;
	private int age;

	
	
	public Person() {
		this("","",0);
	}
	
	
	public Person(String fname, String lname, int age) {
	
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}

	@Override
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("first name = ");

		fname = sc.next();
		System.out.println("LAST name = ");

		lname = sc.next();
		System.out.println("AGE = ");

		age = sc.nextInt();

	}

	@Override
	public void show() {
		System.out.println("NAME= "+fname+" "+lname);
		System.out.println("AGE = "+age);

	}


	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}

}
