import java.util.Scanner;

public class Student {

	private int rollno;
	private String name;
	private int marks;
	public Student(int rollno, String name, int marks) {
		
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student() {
		
	}
	
	public void accept() {
		System.out.println("ENTER NAME ");
		Scanner sc = new Scanner(System.in);
		name=sc.next();
		System.out.println("ENTER RollNO ");
		rollno=sc.nextInt();
		System.out.println("ENTER MARKS = ");
		marks=sc.nextInt();
		
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	
	
}
