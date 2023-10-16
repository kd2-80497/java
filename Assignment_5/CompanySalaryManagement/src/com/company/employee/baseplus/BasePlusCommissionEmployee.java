package com.company.employee.baseplus;

import com.company.employee.comission.CommissionEmployee;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	double baseSalary;
	double totalSalary;
	
	public BasePlusCommissionEmployee() {
		this("","",0,0);
		baseSalary=10000+0.1*10000;
	}
	

	public BasePlusCommissionEmployee(String fName, String lName, int ssn, int grossSales) {
		super(fName, lName, ssn, grossSales);
		baseSalary=10000+0.1*10000;;
		
	}
	
	public void accept() {
		super.accept();
	}
	
	public void totalSalary() {
		totalSalary= super.getCommissionRate()+super.getGrossSales()+baseSalary;
		System.out.println("YOUR  TOTAL BASEPLUS COMMISSION SALARY IS = "+totalSalary);
	}


	@Override
	public String toString() {
		return super.toString()+"BasePlusCommissionEmployee [baseSalary=" + baseSalary + ", totalSalary=" + totalSalary + "]";
	}
	

}
