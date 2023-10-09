import java.util.Scanner;

public class Customer {
	
	private int  accountNumber;
	private   int balance;
	private int item;
	private int totalCredit;
	private int  creditLimit;
	
	public Customer() {
		this.accountNumber =0;
		this.balance = 0;
		this.item = 0;
		this.creditLimit = 0;
	}

	public Customer(int accountNumber, int balance, int item, int creditLimit) {
		
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.item = item;
		this.creditLimit = creditLimit;
	}
	
	public void accept() {
		System.out.println("ENTER ACCOUNT NUMBER = ");
		Scanner sc=new Scanner(System.in);
		accountNumber=sc.nextInt();
		System.out.println("ENTER BaLANCE AT THE BEGINNING OF THE MONTH = ");
		balance=sc.nextInt();
		System.out.println("ENTER  TOTAL NO OF ITEMS CHARGED IN TTHIS MONTH = ");
	     item=sc.nextInt();
	     System.out.println("ENTER CREDIT APPLIED TO YOUR ACCOUNT THIS MONTH = "); 
	     totalCredit = sc.nextInt();
	     System.out.println("ENTER CREDIT LIMIT = ");
	     creditLimit=sc.nextInt();
	
	}
	
	public void display() {
		System.out.println("ACOUNT NUMBER = "+accountNumber);
		System.out.println("BALANCE  = "+balance);
		System.out.println("TOTAL NO OF ITEMS  = "+item);
		System.out.println(" CREDIT THIS MONTH = "+totalCredit);
		System.out.println("CREDIT LIMIT  = "+creditLimit);
		
	}
	public double calculateNewBalance() {
		double newBalance=(balance+item)-totalCredit;
		return newBalance;
	}
	
	public void checkCreditLimit() {
		if( calculateNewBalance()>creditLimit) {
			System.out.println("CREDIT LIMIT EXCEEDED......");
		}
		else
			System.out.println("CREDIT LIMIT NOT EXCEEDED CAN DO MORE SHOPPPING.........");
		
		
	}
	
	

}
