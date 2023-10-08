
public class Date {

	
	
	
	int date;
	int month;
	int year;
	
	public Date(){

		this.date = 0;
		this.month = 0;
		this.year = 0	;
	}

	public Date(int date, int month, int year) {
		
		
		this.date = date;
		this.month = month;	
		this.year = year;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	
	public void display() {
		System.out.println("DATE = "+date+"/"+month+"/"+year);
	}
	
	
	
	
}
