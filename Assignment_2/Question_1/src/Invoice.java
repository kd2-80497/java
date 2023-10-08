import java.util.Scanner;

public class Invoice {
	String partNumber;

	String partdescprition;
	int qty;
	double price;

	public Invoice() {
		this.partNumber = "0";
		this.partdescprition = "0";
		this.qty = 0;
		this.price = 0;
	}

	public Invoice(String partNumber, String partdescprition, int qty, double price) {

		this.partNumber = partNumber;
		this.partdescprition = partdescprition;
		this.qty = qty;
		this.price = price;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartdescprition() {
		return partdescprition;
	}

	public void setPartdescprition(String partdescprition) {
		this.partdescprition = partdescprition;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

void accept() {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER THE QUANTITY YOU WANT TO BUY = ");
	qty=sc.nextInt();
	if(qty<0) {
		qty=0;
	}
	System.out.println("ENTER THE Price OF THE PART = ");
	price=sc.nextDouble();
	if(price<0) {
		price=0.0;
	}
}
	
	
	
public double calculateAmount() {
		double totalAmount;
		totalAmount=price*qty;
	
	return totalAmount;
	}


}

