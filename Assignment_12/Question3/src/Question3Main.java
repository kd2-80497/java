import java.util.Scanner;

public class Question3Main {

	static void calculate(double num1, double num2, Airthmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("REsult " + result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		double num1;
		double num2;
		System.out.println("enter first number  = ");
		num1 = sc.nextDouble();
		System.out.println("enter Second number  = ");
		num2 = sc.nextDouble();

		do {

			
			System.out.println("1.Perform addition");
			System.out.println("2.Perform substraction");
			System.out.println("3.Perform Multiplication");
			System.out.println("4.Perform division");
			System.out.println("Enter choice = ");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				calculate(num1, num2, (a, b) -> a + b);

				break;
			case 2:
				calculate(num1, num2, (a, b) -> a - b);

				break;
			case 3:
				calculate(num1, num2, (a, b) -> a * b);
				break;
			case 4:
				calculate(num1, num2, (a, b) -> a / b);
				break;
			}

		} while (choice != 0);

	}

}
