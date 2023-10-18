import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		class EmployeeComparator implements Comparator<Employee>{

			@Override
			public int compare(Employee arg0, Employee arg1) {
				int diff= arg0.empid-arg1.empid;
				return diff;
			}
			
		}
		
		
		List<Employee> list = new LinkedList<Employee>();
		Employee e;
		int choice, index;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.add ");
			System.out.println("2.delete ");
			System.out.println("3.find ");
			System.out.println("4.sort");
			System.out.println("5.edit");
			System.out.println("Enter choice  ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				e = new Employee();
				e.accept();
				list.add(e);
				break;

			case 2:
				System.out.println("ENTER INDEX TO DELETE = ");
				index = sc.nextInt();
				list.remove(index);
				break;

			case 3:
				System.out.println("ENETR EMPID TO SEARCH =");
				int empid = sc.nextInt();
				e = new Employee();
				e.setEmpid(empid);
				if (list.contains(e)) {
					System.out.println("EMPLOYEE FOUND");
					index = list.indexOf(e);
					list.get(index).Display();;

				} else
					System.out.println("employee not found..");
				break;
			case 4: 
				EmployeeComparator ec= new EmployeeComparator();
				Collections.sort(list, ec);
				System.out.println(list.toString());

				
				break;
			case 5:
				System.out.println("Enter emp id to be modified: ");
				int id = sc.nextInt();
				Employee key = new Employee();
				key.setEmpid(id);
				index = list.indexOf(key);
				if(index == -1)
				System.out.println("Employee not found.");
				else {
				Employee oldEmp = list.get(index);
				System.out.println("Employee Found: " + oldEmp);
				System.out.println("Enter new information for the Employee");
				Employee newEmp = new Employee();
				newEmp.accept();
				list.set(index, newEmp);
				
				
				
			}
		
				break;
			}
		} while(choice != 0);
	
		
	
		
}
	}
