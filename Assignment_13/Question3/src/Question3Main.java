import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class Question3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try (FileWriter fwr = new FileWriter("file.txt")) {
			try (BufferedWriter bwr = new BufferedWriter(fwr)) {
				System.out.println("Enter LIne...");
				for (int i = 1; i <= 4; i++) {
				
					String line = sc.nextLine();
					bwr.write(line);
					bwr.newLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("NEW LINE ADdED");
	}

}
