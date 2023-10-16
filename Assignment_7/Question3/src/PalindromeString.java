import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string;
		System.out.println("ENTER STRING = ");
		string=sc.next();
		System.out.println("string = "+string);
		String rev="";
		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);
			rev=ch+rev;
			
		}
		System.out.println("reverse string = "+rev);
		if(string.equals(rev)) {
			System.out.println("STRING IS PALINDROME ");
			
		}
		else
		{
			System.out.println("STRING IS NOT PALINDROME ");

		}

	}

}
