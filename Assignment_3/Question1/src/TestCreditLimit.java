
public class TestCreditLimit {

	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.accept();
		customer.display();
		customer.calculateNewBalance();
		customer.checkCreditLimit();

	}

}
