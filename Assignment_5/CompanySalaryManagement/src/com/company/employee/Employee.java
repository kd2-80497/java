package com.company.employee;

import java.util.Scanner;

abstract public class Employee {

	private String fName;
	private String lName;
	private int ssn;

	public Employee() {
		this("", "", 0);
	}

	public Employee(String fName, String lName, int ssn) {

		this.fName = fName;
		this.lName = lName;
		this.ssn = ssn;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public void accept() {
		System.out.print("ENETR First NAME = ");

		Scanner sc = new Scanner(System.in);
		fName = sc.next();
		System.out.print("ENETR last NAME = ");
		lName = sc.next();
		System.out.print("ENETR ssn = ");
		ssn = sc.nextInt();
		
	}

	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", ssn=" + ssn + "]";
	}

	abstract public void totalSalary();

}
