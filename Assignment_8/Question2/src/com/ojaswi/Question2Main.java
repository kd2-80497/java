package com.ojaswi;

public class Question2Main {

	public static void printDisplayableBox(Box<? extends Displayable> b) {
		b.get().show();
	}

	public static void printAnyBox(Box<?> b) {
		System.out.println(b.get().toString());
	}

	public static void main(String[] args) {
		
Person p = new Person();
Box<Person> b= new Box<>();
b.set(p);
b.get().accept();
printDisplayableBox(b);
printAnyBox(b);

Date d= new Date();
Box<Date> b1= new Box();
b1.set(d);
b1.get().accept();
printAnyBox(b1);

	
	}

}
