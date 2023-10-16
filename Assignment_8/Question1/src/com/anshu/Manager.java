package com.anshu;

import java.util.Scanner;

public class Manager extends Employee {
	double commision;
	
	public Manager() {
		super();
//		salary=100000;
		// TODO Auto-generated constructor stub
	}

	public Manager(String fname, String lname, double salary, double commision) {
		super(fname, lname, salary);
		this.commision = commision;
//		salary=100000;
	}
	@Override
	public double totalSalary() {

//System.out.println("total salary = "+(bonus+super.getSalary()));
		return (commision + super.getSalary());
	}

	@Override
		void accept() {
			// TODO Auto-generated method stub
			super.accept();
			System.out.println("enter commision =");
			Scanner sc=new Scanner(System.in);
			commision=sc.nextDouble();
		}

	@Override
	public String toString() {
		return super.toString()+"Salesman [commision=" + commision+ "]";
	}
}
