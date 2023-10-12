package com.company.employee.comission;

import java.util.Scanner;

import com.company.employee.Employee;

public class CommissionEmployee extends Employee {

	double commissionRate;
	int grossSales;
	double totalsalary;

	public CommissionEmployee() {
		this("","",0,0);
	}
	public CommissionEmployee(String fName, String lName, int ssn, int grossSales) {
		super(fName, lName, ssn);
		this.commissionRate = 0.2;
		this.grossSales = grossSales;
	}
	

	public double getCommissionRate() {
		return commissionRate;
	}


	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}


	public int getGrossSales() {
		return grossSales;
	}


	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}


	public void accept() {
		super.accept();
		System.out.print("ENTER YOUR GROSS SALE = ");
		Scanner sc = new Scanner(System.in);
		grossSales = sc.nextInt();
	}
	

	@Override
	public void totalSalary() {
		totalsalary = commissionRate * grossSales;
		System.out.println("YOUR COMISSION SALARY IS = " + totalsalary);

	}

	@Override
	public String toString() {
		return "CommissionEmployee [commissionRate=" + commissionRate + ", grossSales=" + grossSales + ", totalsalary="
				+ totalsalary + "]";
	}

}
