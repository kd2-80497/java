
	

import java.util.Objects;
import java.util.Scanner;

public class Book4 implements Comparable<Book4>{
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;

	public Book4() {

	}

	public Book4(String isbn, double price, String authorName, int quantity) {

		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void accept() {
		System.out.println("ENTER ISBN ");
		Scanner sc = new Scanner(System.in);
		isbn = sc.next();
		System.out.println("ENTER price ");
		price = sc.nextDouble();
		System.out.println("ENTER AUTHOR NAME ");
		authorName = sc.next();
		System.out.println("ENTER QUANTITY ");
		quantity = sc.nextInt();
	}

	public void display() {
		System.out.println(" ISBN =" + isbn);
		System.out.println(" PRICE =" + price);
		System.out.println(" AUTHOR NAME =" + authorName);

		System.out.println(" QUANTITY =" + quantity);

	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (this == obj)
			return true;
		if (obj instanceof Book4) {
			Book4 b = (Book4) obj;
			if (this.isbn.equals(b.isbn))
				return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hash = Objects.hash(this.isbn);
		// int hash=Objects.hashCode(isbn);
		return hash;
	}

	@Override
	public int compareTo(Book4 arg0) {
		int diff = this.isbn.compareTo(arg0.isbn);
		return diff;
	}
	
	

}



