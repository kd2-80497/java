import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookShop {

	public static void main(String[] args) {
		List<Book> list = new ArrayList<Book>();
		int choice;
		String isbn;
//		
//		class BookComparator implements Comparator<Book>{
//
//			@Override
//			public int compare(Book b1, Book b2) {
//				int diff =b1.getIsbn().c;
//				return diff;
//			}
//			
//		}
//		

		do {
			System.out.println("********Menu*********");
			System.out.println("1. Add new book in List");
			System.out.println("2. Display all books in forward order using random access");
			System.out.println("3. Search a book with given isbn ");
			System.out.println("4. Delete a book at given index.");
			System.out.println("5. Delete a book with given isbn.");
			System.out.println("6. Reverse the list ");
			System.out.println("ENTER CHOICE ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				Book b = new Book();
				b.accept();
				if (list.contains(b)) {
					System.out.println("LIST ALREAY CONTAIN BOOK");
					int index = list.indexOf(b);
					b.setQuantity(b.getQuantity() + 1);
					list.set(index, b);
					System.out.println("QUANTITY OF BOOK = " + b.getQuantity());
					;

				} else {
					list.add(b);
					System.out.println("BOOK ADDED SUCESSFULLY...");

				}

				break;
			case 2:
				for (int i = 0; i < list.size(); i++) {
					list.get(i).display();

				}

				break;
			case 3:
				System.out.println("ENTER ISBN TO SEARCH = ");
				isbn = sc.next();
				Book b1 = new Book();

				b1.setIsbn(isbn);
				if (list.contains(b1)) {
					System.out.println("book found");
					int ind = list.indexOf(b1);
					list.get(ind).display();

				}

				break;
			case 4:
				System.out.println("ENTER INDEX TO DELETE = ");
				int i = sc.nextInt();
				if (i < 0 || i > list.size()) {
					System.out.println("INVALID INDEX...");
					break;
				}
				list.remove(i);

				break;
			case 5:
				System.out.println("ENTER ISBN TO SEARCH = ");
				isbn = sc.next();
				Book b2 = new Book();

				b2.setIsbn(isbn);
				if (list.contains(b2)) {
					System.out.println("book found");
					int ind = list.indexOf(b2);
					list.remove(ind);

				}
				break;
			case 6:
				Collections.reverse(list);
				break;
			}

		} while (choice != 0);
	}

}
