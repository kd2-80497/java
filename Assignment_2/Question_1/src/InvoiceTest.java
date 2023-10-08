
public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice=new Invoice();
		invoice.accept();
		double amount=invoice.calculateAmount();
		 
System.out.println("TOTAL AMOUNT = "+amount);
	}

}
