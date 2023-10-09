
import com.app.geometry.*;


public class TestPoint {

	public static void main(String[] args) {
		
		Point2D p = new Point2D();
		p.accept();
		
		Point2D p1 = new Point2D();
		p1.accept();
		
		String point= p.getDetails();
		String point2=p1.getDetails();
		
		if(p.isEqual(p1)) {
			System.out.println("p1 & p2 are located at the same location");
		}
		else {
			
			System.out.println("p1 & p2 are not located at the same location");
			p.calculateDistance(p1);
		}
		
	
		
		
	}

}
