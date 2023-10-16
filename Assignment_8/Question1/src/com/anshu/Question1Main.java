package com.anshu;

public class Question1Main {

	// public static void
	public static void main(String[] args) {

//		Box<Person> p = new Box<>();
//		p.set(new Person());
//		p.get().accept();
//		System.out.println(p.get().toString());
//		p.get().toString();
//		
//		Box<Employee> e = new Box<>();
//		e.set(new Manager());
//		e.get().accept();
//		e.get().totalSalary();
//		System.out.println(e.get().toString());
//		e.get().totalSalary();

//		Box<Employee> e1 = new Box<>();
//		e1.set(new Salesman());
//		e1.get().accept();
//		e1.get().totalSalary();
//		System.out.println(e1.get().toString());
//		e1.get().totalSalary();

		Box<Employee> e = new Box();
		e.set(new Manager());

		e.get().accept();

		System.out.println("total salary " + e.getSalary());
		System.out.println(e.get().toString());

		Box<Employee> e1 = new Box();
		e1.set(new Salesman());

		e1.get().accept();

		System.out.println("total salary " + e1.getSalary());
		System.out.println(e1.get().toString());
		Manager m = new Manager();
		Box<Manager> e3 = new Box<>();
		e3.set(m);

		e3.get().accept();

		System.out.println("total salary " + e3.getSalary());
		System.out.println(e3.get().toString());

	}

}
