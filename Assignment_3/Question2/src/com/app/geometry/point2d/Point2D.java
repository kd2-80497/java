
package com.app.geometry.point2d;
import java.lang.Math;
import java.util.Scanner;

public class Point2D {
	
	int x;
	int y;
	public Point2D() {
	 
		
	}
	public Point2D(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
	public String getDetails() {
		String point= "Point= ("+x+","+y+")";
		
		return point;
		
		
		
	}
	
	public void accept() {
		System.out.println("ENTER X POINT = ");
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		System.out.println("ENTER Y POINT = ");
		y=sc.nextInt();
		
	}
	public void display() {
		System.out.println("("+x+","+y+")");
	}
	
	

	public boolean isEqual(Point2D p) {
		if(this.x == p.x) {
			
			if(this.y==p.y) {
				
				return true; 
			}
			}
		return false;
		}
	
	
	public  void calculateDistance(Point2D p) {
		if( isEqual(p)) {
			System.out.println("CORDINNATE HAVE SAME VALUE CANNOT CALCULATE DISTANCE....");
		}
		else {
		double distance=Math.sqrt(Math.pow((p.x-this.x),2)+Math.pow((p.y-this.y),2));
		System.out.println("DISTANCE BETWEEN TWO POINT IS = "+distance);
		}
		
	}
	
	
	

}