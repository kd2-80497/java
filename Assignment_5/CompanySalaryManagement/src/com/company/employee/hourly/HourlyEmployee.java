package com.company.employee.hourly;

import java.util.Scanner;

import com.company.employee.Employee;

public class HourlyEmployee extends Employee {

	double hourlyWage;
	int hours;
	double totalsalary;

	public HourlyEmployee() {
		this(0, 0);
		this.hourlyWage = 500;
		this.hours = 0;
	}

	public HourlyEmployee(double hourlyWage, int hours) {
		super("", "", 0);
		this.hourlyWage = 500;
		this.hours = hours;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public void accept() {
		super.accept();
		Scanner sc = new Scanner(System.in);

		System.out.print("ENTER HOURS = ");
		this.hours = sc.nextInt();
	}

	@Override
	public void totalSalary() {
		
		if (this.hours <= 40) {
			totalsalary = hourlyWage * hours;
		} else if (hours > 40) {
			totalsalary = 40 * hourlyWage + (hours - 40) * hourlyWage * 1.5;
		} else
			System.out.println("ENTERD HOURS ARE NOT VALID ENTER IT AGAIN... ");

		System.out.println("YOUR HOURLY SALARY IS " + totalsalary);

	}

	@Override
	public String toString() {
		return "HourlyEmployee [hourlyWage=" + hourlyWage + ", hours=" + hours + ", TotalSalary=" + totalsalary + "]";
	}

}
