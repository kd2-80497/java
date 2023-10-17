
public class Question4_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int k = 4; k >=i; k--) {
				System.out.print(" ");
			}

			for (int j = 0; j < 2*i-1; j++) {

				System.out.print("*");
			}

			System.out.println();
		}


	}

}
