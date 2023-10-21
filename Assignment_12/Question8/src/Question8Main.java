import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Question8Main {

	public static void main(String[] args) {
		
		IntStream str=IntStream.range(1, 10);
		//System.out.println(str);
//		str.forEach(ele->System.out.println(ele));
		int sum=str.sum();
		System.out.println("total sum = "+sum);
		
		IntStream str1=IntStream.range(1, 10);
		OptionalDouble avg=str1.average();
		System.out.println("total avg = "+avg);
		
		IntStream str3=IntStream.range(1, 10);
		System.out.println(str3.summaryStatistics());
		//IntStream str4=(IntStream) str1.summaryStatistics();
//		System.out.println("total avg = "+avg);
		//str4.forEach(ele->System.out.println(ele));
}}
