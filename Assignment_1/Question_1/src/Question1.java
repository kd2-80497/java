import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
	System.out.print("ENTER A NUMBER = ");
	int num;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	System.out.println("Given Number = "+num);
	
	String num1=Integer.toBinaryString(num);
	System.out.println("Binary Equivalent = "+num1);
	
	String num2=Integer.toOctalString(num);
	System.out.println("Octal Equivalent = "+num2);
	
	String num3=Integer.toHexString(num);
	System.out.println("Hexadecimal Equivalent = "+num3);
	
	
	
	
	

	}

}
