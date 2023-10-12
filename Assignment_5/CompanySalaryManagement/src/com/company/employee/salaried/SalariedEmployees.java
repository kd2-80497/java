package com.company.employee.salaried;

import com.company.employee.Employee;

public class SalariedEmployees extends Employee {

	double weekelySalary;

	public SalariedEmployees() {
		super();
		this.weekelySalary = 8000;
	}

	public SalariedEmployees(String fName, String lName, int ssn) {
		super(fName, lName, ssn);
		this.weekelySalary = 8000;
	}

	public void accept() {
		super.accept();
	}

	@Override
	public void totalSalary() {

		System.out.print("YOUR WEEKLY SALARY IS =  " + weekelySalary);
	}

	@Override
	public String toString() {
		return super.toString() + "SalariedEmployees [weekelySalary=" + weekelySalary + "]";
	}

}
