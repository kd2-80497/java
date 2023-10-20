
public class Labour implements Emp {
	int hours;
	double rate;

	
	
	public Labour(int hours, double rate) {
		super();
		this.hours = hours;
		this.rate = rate;
	}

	@Override
	public double getSal() {

		return hours * rate;
	}

	public double CalcIncentives() {
		if (hours > 300) {
			return 0.05 * getSal();
		}
		System.out.println("NO INCENTIVESS...");
		return 0.0;
	}

}
