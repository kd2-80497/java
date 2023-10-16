package com.anshu;

import java.util.Scanner;

public class Person {
	
	private String Fname;
	private String Lname;
	public Person(String fname, String lname) {
		
		Fname = fname;
		Lname = lname;
	}
	
	public Person() {
		this(""," ");
	}
	void accept() {
		System.out.println("enter fname  = ");
		Scanner sc=new Scanner(System.in);
		Fname=sc.next();
		System.out.println("enter Lname  = ");
		Lname=sc.next();
	}

	@Override
	public String toString() {
		return "Person [Fname=" + Fname + ", Lname=" + Lname + "]";
	}


}
