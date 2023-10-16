package com.ojaswi;

import java.util.Scanner;

public class Date implements Displayable {

	int day;
	int month;
	int year;
	
	public Date() {
	this(0,0,0)	;
	}
	public Date(int day, int month, int year) {
	
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public void accept() {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER  DAY =");
		day=sc.nextInt();
		System.out.println("ENTER  MONTH =");
		month=sc.nextInt();

		System.out.println("ENTER  YEAR =");
		year=sc.nextInt();

	}

	@Override
	public void show() {
		System.out.println("DATE ="+day+"/"+month+"/"+year);

	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}
