package com.anshu.book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Question4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Book> list = new ArrayList<Book>();

		int choice;
		int index;
		boolean key;
		String isbn;
		do {
			System.out.println("1. Add new book in list.");
			System.out.println("2. Display all books in forward order.");
			System.out.println("3. Delete at book given index");
			System.out.println("4. Check if book with given isbn is in list or not");
			System.out.println("5. Delete all books in list");
			System.out.println("6. Display number of books in list");
			System.out.println("7. Sort all books by price in desc order.");
			System.out.println("ENTER CHOICE ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				Book book = new Book();
				book.accept();
				list.add(book);

				break;
			case 2:
				for (Book ele : list) {
					ele.display();
				}

				break;

			case 3:
				System.out.println("enter index to delete");
				index = sc.nextInt();
				if (index < 0 || index > list.size()) {
					System.out.println("wrong index....");
				} else {
					list.remove(index);
					System.out.println(index + " deleted sucessfully...");
				}

				break;

			case 4:
				System.out.println("enter isbn to search = ");
				isbn = sc.next();
				Book b = new Book();
				b.setIsbn(isbn);

				key = list.contains(b);
				System.out.println(key);
				if (list.contains(b))
					System.out.println(b + "is present in LIst");
				else
					System.out.println(b + "is not present in list");

				break;

			case 5:
				list.clear();
				break;

			case 6:
				System.out.println("NO OF books = " + list.size());
				break;
			case 7:
				class BookComparator implements Comparator<Book> {

					@Override
					public int compare(Book b1, Book b2) {
						int diff = -(int) (b1.getPrice() - b2.getPrice());
						return diff;
					}

				}
				BookComparator bc = new BookComparator();
				list.sort(bc);
				for(Book b1:list) {
					b1.display();
				}

				break;

			}

		} while (choice != 0);

	}

}
