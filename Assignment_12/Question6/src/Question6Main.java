import java.util.Scanner;
import java.util.stream.Stream;

public class Question6Main {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in); 
	
	System.out.println("ENTER  NUMBER TO CALCULATE FACTORIAL");
	
	
	int num=sc.nextInt();
	
	Stream<Integer> str=Stream.iterate(1,x->x+1).limit(num);
	int result=str.reduce(1, (a,b)->a*b);
	System.out.println("FACTORIAL = "+result);
	
	
	
	}

}
