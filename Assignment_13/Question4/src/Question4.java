import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class Question4 {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader("/home/sunbeam/my_git_data/java/java/Assignment_13/Question3/file.txt")) {
			try (BufferedReader br = new BufferedReader(fr)) {
				String line;
			
					while ((line = br.readLine()) != null)

					{
						System.out.println(line);
					}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
