import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
      double num1;
      double num2;
      double sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("ENTER NUM1 = ");
     
    
      
    num1=sc.nextDouble();
      
     if(sc.hasNextInt()) {
    	 System.out.println("ENTERED NUMBER SHOULD BE DOUBLE oNLY");
     }
     else {
    	 System.out.println("ENTERED NUMBER SHOULD BE DOUBLE oNLY");
     }
    
     num2=sc.nextDouble();
     
         if(sc.hasNextDouble()) {
        	 
        	sum=sum+num2;
        	  
          }
         else {
          System.out.println("ERROR:NUMBER ENTERD SHOULD BE IN ONLY DOUBLE");
      }
         double avg=sum/2;
         System.out.println("AVERAGE = "+avg);
	      
	      
    


	}

}
