
public class Clerk implements Emp {
	
	double salary;

	
	
	public Clerk(double salary) {
		super();
		this.salary = salary;
	}



	@Override
	public double getSal() {

		return salary;
	}


}
