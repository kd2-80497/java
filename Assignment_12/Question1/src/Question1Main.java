
public class Question1Main {

	public static void main(String[] args) {
		Emp arr[]= new Emp[3];
		arr[0]=new Manager(2344.4,12.34);
		arr[1]=new Clerk(2344.42);
		arr[2]=new Labour(600,589.43);
		
		double income=Emp.calcTotalIncome(arr);
		System.out.println("TOTAL INCOME = "+income);

	}

}
