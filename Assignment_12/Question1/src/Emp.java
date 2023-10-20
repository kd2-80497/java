
public interface Emp {
	

	double getSal();

	default double CalcIncentives() {
		return 0.0;
	}

	static double calcTotalIncome(Emp arr[]) {
		double total=0;
		for (Emp a : arr) {
			total = a.getSal() + a.CalcIncentives();
		}
		return total;

	}
}
