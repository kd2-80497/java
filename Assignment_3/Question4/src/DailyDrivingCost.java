import java.util.Scanner;

public class DailyDrivingCost {
	
	private float milesDriven;
	private float costPerGallon;
	private int parkingFees;
	private float avgMiles;
	private float toll;
	
	
	public DailyDrivingCost() {
		this.milesDriven = 0;
		this.costPerGallon = 0;
		this.parkingFees = 0;
		this.avgMiles = 0;
		this.toll = 0;
	}


	public DailyDrivingCost(float milesDriven, float costPerGallon, int parkingFees, float avgMiles, float toll) {
		
		this.milesDriven = milesDriven;
		this.costPerGallon = costPerGallon;
		this.parkingFees = parkingFees;
		this.avgMiles = avgMiles;
		this.toll = toll;
	}
	
	public void accept() {
		System.out.println("ENTER Total miles driven per day.");
		Scanner sc= new Scanner(System.in);
		milesDriven = sc.nextFloat();
		System.out.println("Enter Cost per gallon of gasoline..");
		costPerGallon=sc.nextFloat();
		System.out.println("Enter Average miles per gallon..");
		avgMiles=sc.nextFloat();
		System.out.println("Enter Parking fees per day..");
		parkingFees=sc.nextInt();
		System.out.println("Enter Tolls per day...");
		toll=sc.nextFloat();
		
	}
	
	public void calculateCostPerDay() {
		
		
		float totalCost=((milesDriven/avgMiles)*costPerGallon)+parkingFees+toll;
		System.err.println("TOTAL COST PER DAY OF DRIVING TO WORK IS "+totalCost);
				
		
	}
	
	
	

}
