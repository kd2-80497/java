import java.util.Scanner;

public class Employee implements Comparable<Employee>{
	int empid;
	String fname;
	String lname;
	double salary;

	public Employee() {

		this(0, "", "", 0);
	}

	public Employee(int empid, String fname, String lname, double salary) {
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
		this.empid = empid;
		// TODO Auto-generated constructor stub
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	void accept() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter emp id = ");
		empid = sc.nextInt();
		System.out.println("enter Fname = ");
		fname = sc.next();
		System.out.println("enter lname = ");
		lname = sc.next();
		System.out.println("enter salary = ");

		salary = sc.nextDouble();
	}

//	abstract public double totalSalary();

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void Display() {
		System.out.println("empid = " + empid);
		System.out.println("fname = " + fname);

		System.out.println("lname = " + lname);

		System.out.println("salary = " + salary);

	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", fname=" + fname + ", lname=" + lname + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (obj instanceof Employee) {
			Employee e = (Employee) obj;
			if (this.empid == e.empid) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int compareTo(Employee arg0) {
		int diff= this.empid-arg0.empid;
		return diff;
	}

	
	
	
}
