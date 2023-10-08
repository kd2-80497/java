import java.util.Scanner;

public class Employee {

	String firstName;
	String LastName;
	double salary;
	
	public Employee(){
		this.firstName = "";
		LastName = "";
		this.salary = 0.0;	
	}

	public Employee(String firstName, String lastName, double salary) {
		
		this.firstName = firstName;
		LastName = lastName;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary<0) {
		System.out.println("SALARY CANNOT BE CHANGED... ENTER APPROPRIATE SALARY ..");
		}
		else {
			this.salary = salary;
		}
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER FIRST NAME = ");
		firstName=sc.next();
		//System.out.print("FIRST NAME = "+firstName);
		System.out.println("ENTER LAST NAME = ");
		LastName=sc.next();
		System.out.println("ENTER SALARY = ");
		salary=sc.nextDouble();
      if(salary<0) {
    	  System.out.println("INVALID SALARY ENTERD....");
    	  salary=0.0;
      }
		
	     
	
		
	}
	
	public void display()
{
		System.out.println("NAME = "+firstName+" "+LastName);
		
		System.out.println("SALARY = "+salary*12);
		
	
	}	
	 
	public void newSalary() {
		
		this.salary=0.1*this.salary+this.salary;
		
	}
	
}

