import java.util.Arrays;
import java.util.Comparator;

public class Question3Main {

	public static void main(String[] args) {

		class StudentComparator implements Comparator<Student> {
			@Override
			public int compare(Student s1, Student s2) {

				int diff = s2.getCity().compareTo(s1.getCity());
				if (diff == 0)
					diff = (int) (s2.getMarks() - s1.getMarks());
				if (diff == 0)
					diff = -s2.getName().compareTo(s1.getName());

				return diff;
			}
		}

		Student[] arr = new Student[6];
		arr[0] = new Student(1, "anshu", "karad", 48);
		arr[1] = new Student(2, "ojaswi", "ramakona", 45);
		arr[2] = new Student(3, "anshu", "ramakona", 46);
		arr[3] = new Student(4, "ojaswi", "sausar", 47);
		arr[4] = new Student(5, "janvi", "nagpur", 49);
		arr[5] = new Student(6, "chiku", "ramakona", 45);

		StudentComparator stc = new StudentComparator();

		Arrays.sort(arr, stc);
		for (Student e : arr) {
			System.out.println(e);
		}
		

	}
}
