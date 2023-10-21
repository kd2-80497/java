import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookMain {
//	static void writeBook() {
//		try (FileOutputStream fout = new FileOutputStream("Book.bin")) {
//			try (ObjectOutputStream dout = new ObjectOutputStream(fout)) {
//
//				dout.writeObject(list);
//
//			} // dout.close
//
//		} // fout.close
//
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("BOOK SAVED SUCESSFULLYY..");
//	}
//
//	static void readBook() {
//		List<Book> list1;
//		try (FileInputStream fin = new FileInputStream("Book.bin")) {
//			try (ObjectInputStream oin = new ObjectInputStream(fin)) {
//
//				list1 = (List<Book>) oin.readObject();
//				list1.forEach(x -> System.out.println(x));
//			} // oin.close
//		} // fin.close
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> list = new ArrayList<Book>();
		List<Book> list1;
		int choice;
		String isbn;

		do {
			System.out.println("********Menu*********");
			System.out.println("1. Add new book in List");
			System.out.println("2. Display all books in forward order using random access");
			System.out.println("3. Search a book with given isbn ");
			System.out.println("4. Delete a book at given index.");
			System.out.println("5. Delete a book with given isbn.");
			System.out.println("6.reverse list");
			System.out.println("7.SAVE BOOK IN FILES");
			System.out.println("8. Load book from files ");
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

			case 7:
				try (FileOutputStream fout = new FileOutputStream("Book.bin")) {
					try (DataOutputStream dout = new DataOutputStream(fout)) {

					for(Book bk : list) {
						dout.writeUTF(bk.getIsbn());
						dout.writeDouble(bk.getPrice());
						dout.writeUTF(bk.getAuthorName());
						dout.writeInt(bk.getQuantity());
					}

					} // dout.close

				} // fout.close

				catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("BOOK SAVED SUCESSFULLYY..");
				break;
			
			
			case 8:System.out.println("LOADING*******************");
				try(FileInputStream fin = new FileInputStream("Book.bin")){
				try(DataInputStream oin = new DataInputStream(fin)) {
					
					while(true) {
					Book book = new Book();
					book.setIsbn(oin.readUTF());
					book.setPrice(oin.readDouble());
					book.setAuthorName(oin.readUTF());
					book.setQuantity(oin.readInt());
					System.out.println(book);
					}
					}
				}//oin.close
			//fin.close
				catch(EOFException e) {
					
				}
			catch(Exception e) {
				e.printStackTrace();
			}
		
				break;
		
		}
		} while(choice != 0);

	}
}
