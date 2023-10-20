
public class Question4Main {

	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count = 0;
		for (T a : arr) {
			if (c.compare(a, key)) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
	
		Integer [] arr = {44, 77, 99, 22, 55, 66};
		Integer key = 50;
		
		int cnt=countIf(arr, key, (x,y)->x>y);
		System.out.println("Count = " + cnt);
	}

}
