package com.company.employee.tester;

import com.company.employee.Employee;
import com.company.employee.baseplus.BasePlusCommissionEmployee;
import com.company.employee.comission.CommissionEmployee;
import com.company.employee.hourly.HourlyEmployee;
import com.company.employee.salaried.SalariedEmployees;

public class tester {

	public static void main(String[] args) {
		System.out.println("************************************");
		System.out.println("SALARIED EMPLOYEEE");

		Employee e = new SalariedEmployees();
		e.accept();
		System.out.println(e);
		System.out.println("************************************");
		System.out.println("HOURLY EMPLOYEEE");

		Employee e1 = new HourlyEmployee();
		e1.accept();
		e1.totalSalary();
		e1.toString();
		System.out.println(e1);
		System.out.println("************************************");
		System.out.println("COMMISSSION EMPLOYEEE");
		
		Employee e2 = new CommissionEmployee();
		e2.accept();
		e2.totalSalary();
		e2.toString();
		System.out.println(e2);
		System.out.println("************************************");
		System.out.println("BASE COMISSION EMPLOYEEE");
		
		Employee e3 = new BasePlusCommissionEmployee();
		e3.accept();
		e3.totalSalary();
		e3.toString();
		System.out.println(e3);
		System.out.println("************************************");
		

	}

}
