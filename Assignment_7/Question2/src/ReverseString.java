import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String string;
		System.out.println("ENTER STRING = ");
		string=sc.next();
		
		String rev="";
		System.out.println(" STRING = "+string);
		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);
			rev=ch+rev;
			
			
			
		}
		System.out.println("REVERSE STRING = "+rev);
		
		

	}

}
