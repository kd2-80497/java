package com.anshu;

import java.util.Scanner;

public class Salesman extends Employee {
	double bonus;

	public Salesman() {
		super();
//	salary=50000;
		// TODO Auto-generated constructor stub
	}

	public Salesman(String fname, String lname, double salary, double bonus) {
		super(fname, lname, salary);
		this.bonus = bonus;
//	salary=50000;
	}

	@Override
	public double totalSalary() {

//System.out.println("total salary = "+(bonus+super.getSalary()));
	double totalsal=	(bonus + super.getSalary());
//	super.setSalary(totalsal);
		return totalsal;
	}

	@Override
	void accept() {
		// TODO Auto-generated method stub
		super.accept();
		System.out.println("enter bonus =");
		Scanner sc = new Scanner(System.in);
		bonus = sc.nextDouble();
	}

	@Override
	public String toString() {
		return super.toString() + "Salesman [bonus=" + bonus + "]";
	}

}
