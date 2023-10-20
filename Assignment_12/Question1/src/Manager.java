
public class Manager implements Emp {

	double basicSalary;
	double dearAllowance;
	
	
	public Manager(double basicSalary, double dearAllowance) {
	
		this.basicSalary = basicSalary;
		this.dearAllowance = dearAllowance;
	}

	@Override
	public double getSal() {
		return basicSalary+dearAllowance;
	}
	
	public double calclncentives() {
		double sal=0.2*basicSalary;
		return sal;
	}
	
	
	
	
}
