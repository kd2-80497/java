import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		do {
			System.out.println("1.ADD new USER");
			System.out.println("2.DELETE CANDIDATE");
			System.out.println("3.UPDATE CANDIDATE");
			System.out.println("4.CHANGE STATUS");
			System.out.println("5.DISPLAY USER");
			System.out.println("6.DISPLAY USER OF SPCIFIC ID");
			System.out.println("ENTER choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				try (UserDAO ud = new UserDAO()) {

					System.out.println("ENETR FNAME  =");
					String fname = sc.next();
					System.out.println("ENETR lNAME  =");
					String lname = sc.next();
					System.out.println("ENETR Email  =");
					String email = sc.next();
					System.out.println("ENETR Password  =");
					String passwd = sc.next();
					System.out.println("ENETR dob  =");
					String dob = sc.next();

					User u = new User(0, fname, lname, email, passwd, dob, true, "voter");
					int count = ud.save(u);
					System.out.println("row inserted = " + count);

				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				try (UserDAO ud = new UserDAO()) {
					System.out.println("ENTER ID TO DELETE =");
					int id = sc.nextInt();

					int cnt = ud.delete(id);
					System.out.println("ROWS DELETED = " + cnt);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try (UserDAO ud = new UserDAO()) {
					System.out.println("ENTER USER ID TO UPDATE = ");
					int id = sc.nextInt();
					System.out.println("ENTER NEW NAME = ");
					String fname = sc.next();
					System.out.println("ENTER NEW LAST NAME = ");
					String lname = sc.next();
					System.out.println("ENTER NEW EMAIL = ");
					String email = sc.next();
					System.out.println("ENTER NEW PASSWORD = ");
					String pw = sc.next();
					System.out.println("ENTER NEW DOB = ");
					String date = sc.next();
					int cnt = ud.update(id, fname, lname, email, pw, date);
					System.out.println("UPDATE ROW  = " + cnt);

				} catch (Exception e) {
					e.printStackTrace();
				}

				break;
			case 4:
				try (UserDAO ud = new UserDAO()) {
					System.out.println("ENTER ID TO CHANGE STATUS = ");
					int id = sc.nextInt();
					int cnt = ud.changeStatus(id);
					System.out.println("UPDATE ROWS  = "+cnt);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 5:
				try(UserDAO ud = new UserDAO() ){
					List<User> list = ud.display();				
					list.forEach(x -> System.out.println(x));
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case 6:try(UserDAO ud = new UserDAO() ){
				System.out.println("Enter id to search = ");
				int id = sc.nextInt();
				List<User> list = ud.displaySpecificId(id);				
				list.forEach(x -> System.out.println(x));
			}catch(Exception e) {
				e.printStackTrace();
			}
				break;
			}

		} while (choice != 0);

	}

}
