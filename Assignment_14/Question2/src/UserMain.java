import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		do {
			System.out.println("ADD new USER");
			System.out.println("DELETE CANDIDATE");
			System.out.println("UPDATE CANDIDATE");
			System.out.println("CHANGE STATUS");
			System.out.println("DISPLAY USER");
			System.out.println("DISPLAY USER OF SPCIFIC ID");
			System.out.println("ENTER choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:try(UserDAO ud= new UserDAO()){
				
				System.out.println("ENETR FNAME  =");
				String fname=sc.next();
				System.out.println("ENETR lNAME  =");
				String lname=sc.next();
				System.out.println("ENETR Email  =");
				String email=sc.next();
				System.out.println("ENETR Password  =");
				String passwd=sc.next();
				System.out.println("ENETR dob  =");
				String dob=sc.next();
			
				System.out.println("ENETR ROLE  =");
				String role=sc.next();
				User u = new User();
				int count = ud.save(u);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			}

		} while (choice != 0);

	}

}
