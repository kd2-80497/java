import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class BooksMain {


	public static void main(String[] args) {
		int choice = -1;
		Books b;
		Map<String,Books> map=new HashMap<>();
		do {

			System.out.println("INsert A Book ");
			System.out.println("Display A Book ");
			System.out.println("FIND A Book ");
			System.out.println("Enter Choice ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch(choice) {
			case 1:b=new Books();
			b.accept();
			map.put(b.getIsbn(), b);
				break;
			case 2: 
				Set<Entry<String,Books>> en=map.entrySet();
			for(Entry<String,Books> entry:en) {
				System.out.println(entry.getKey()+"--->"+entry.getValue());
			}
				break;
			case 3: System.out.println("Enter isbn to search ");
			String isbn=sc.next();
			Books b1=map.get(isbn);
			System.out.println(b1);
			
				break; 
			}
			
		} while (choice != 0);

	}

}
