package com.anshu;

import java.util.Scanner;

public abstract class Employee extends Person {
	double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String fname, String lname, double salary) {
		super(fname, lname);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	void accept() {
		// TODO Auto-generated method stub
		super.accept();
		System.out.println("enter salary = ");
		Scanner sc = new Scanner(System.in);
		salary = sc.nextDouble();
	}

	abstract public double totalSalary();

	@Override
	public String toString() {
		return super.toString() + "Employee [salary=" + this.salary + "]";
	}

}
