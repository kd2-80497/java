package com.anshu;

public class Box<t extends Employee> {

	private t obj;

	public void set(t obj) {
		this.obj = obj;
		
	}

	public t get() {
		return this.obj;
	}

	public double getSalary() {
		return  obj.totalSalary();
	}
}
