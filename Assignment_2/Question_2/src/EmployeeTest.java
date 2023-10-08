
public class EmployeeTest {
	public static void main(String[]  args) {
		
	Employee emp=new Employee();
	System.out.println("ENTER EMPLOYEE 1 DETAILS :- ");
	emp.accept();
	emp.display();
	System.out.println("*****************************************");
	Employee emp1=new Employee();
	System.out.println("ENTER EMPLOYEE 2 DETAILS :- ");
	emp1.accept();
	emp1.display();
	System.out.println("*****************************************");
	
	System.out.println(" EMPLOYEE 1 DETAILS with incremented salary  :- ");
	emp.newSalary();
	emp.display();
	System.out.println("*****************************************");
	
	System.out.println(" EMPLOYEE 2 DETAILS with incremented salary  :- ");
	emp1.newSalary();
	emp1.display();
	
	
	emp1.setSalary(-1);
	

	
	
	
}

	
	

}
