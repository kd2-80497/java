import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		
		int qty;
		double total_amount=0;
		int choice=-1;
		Scanner sc=new Scanner(System.in);
//System.out.println("******MENU*************");
//System.out.println("1.Dosa   price = 60");
//System.out.println("2.Idli    price = 50");
//System.out.println("3.Samosa   price = 70");
//System.out.println("4.vada    price = 80"  );
//System.out.println("5.Maggie   price = 40");
//
//
//System.out.println("**********************");
//
//System.out.println("ENTER YOUR  CHOICE = ");
//
//
//choice=sc.nextInt();


	System.out.println("******MENU*************");
	System.out.println("0.exit");
	System.out.println("1.Dosa   price = 60");
	System.out.println("2.Idli    price = 50");
	System.out.println("3.Samosa   price = 70");
	System.out.println("4.vada    price = 80"  );
	System.out.println("5.Maggie   price = 40");

System.out.println("**********************");

System.out.println("ENTER YOUR  CHOICE = ");
choice=sc.nextInt();
	 switch(choice) {
	 case 0:
		 System.out.println("bye..........");
	 case 1:
		 System.out.println("ENTER NO ITEMS YOU WANT TO OEDER = ");
			
			qty=sc.nextInt();
			total_amount=qty*60;
			System.out.println("********BILL************");
			System.out.println("total  Amunt = "+ total_amount);
			break;
		 
		
		 
	 case 2:
		 System.out.println("ENTER NO ITEMS YOU WANT TO OEDER = ");
			
			qty=sc.nextInt();
			total_amount=qty*50;
	 break;
	 case 3:	 System.out.println("ENTER NO ITEMS YOU WANT TO OEDER = ");
		
		qty=sc.nextInt();
		total_amount=qty*70;
	 break;
	 case 4:	 System.out.println("ENTER NO ITEMS YOU WANT TO OEDER = ");
		
		qty=sc.nextInt();
		total_amount=qty*80;
	 break;
	 
	 case 5:	 System.out.println("ENTER NO ITEMS YOU WANT TO OEDER = ");
		
		qty=sc.nextInt();
		total_amount=qty*40;
	 break;
	
		   default :
			    System.out.println("WRONG CHOICE.....");
			    break;
		
	 
	 
}

System.out.println("********BILL************");
System.out.println("total  Amunt = "+ total_amount);
System.out.println("THANKS FOR COMING......");
	}

}
