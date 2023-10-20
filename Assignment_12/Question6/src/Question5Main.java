

public class Question5Main {
	
	static <T>  int countIf(T[] arr, T key,Check<T> c) {
		int count=0;
	for(T ele:arr) {
		if(c.compare(ele, key)) {
			count++;
		}
	}
		
		return count;
	}

	public static void main(String[] args) {
		

		Double[] arr = {1.1,1.2,1.3,1.2,1.2,1.2};
		Double key=1.2;
		int count = countIf(arr, key, (a,b)->a.equals(b));
		System.out.println("result = "+count);
		
	}

}
