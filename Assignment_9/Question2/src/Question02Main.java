import java.util.Comparator;

public class Question02Main {
	
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class SelectionSortComparator implements Comparator<Double> {

			@Override
			public int compare(Double a, Double b) {
				if (a > b)
					return 1;
				return 0;

			}

		}
		Double arr[]= {21.1,2.2,43.2,22.42,43.32};
		System.out.println("BEFORE SORTING");
		for(Double ele:arr) {
			System.out.println(ele);
		}

		SelectionSortComparator comparator = new SelectionSortComparator();
		selectionSort(arr, comparator);
		System.out.println("AFTER SORTING");
		for(Double ele:arr) {
			System.out.println(ele);
		}

	}
}
