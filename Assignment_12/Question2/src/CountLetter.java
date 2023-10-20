import java.util.function.Predicate;

public class CountLetter {
	public static int countIf(String[] arr,Predicate<String> cond)
	
	{
		int count=0;
		for(String str: arr) {
			if(cond.test(str))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String[] arr = { "Nilesh", "Shubham", "Pratik", "Omkar", "Prashant" };
//countIf(arr, new Predicate<String>() {
//	public boolean test(String s) {
//		return s.length()>6;
//	}
//});
		
int count=	countIf(arr, s->s.length()>6 );
System.out.println("count = "+count);
		

	}

}
