import java.util.LinkedHashMap;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, Student> student = new LinkedHashMap<>();
		int choice;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("ADD STUDENT ");
			System.out.println("find student ");
			System.out.println("enter choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Student s = new Student();
				s.accept();
				student.put(s.getRollno(), s);
				break;
			case 2:
				System.out.println("enter roll no to search = ");
				int roll = sc.nextInt();
				Student s1 = student.get(roll);
				System.out.println(s1);
				break;

			}
		} while (choice != 0);

	}

}
