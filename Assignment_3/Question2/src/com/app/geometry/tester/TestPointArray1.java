package com.app.geometry.tester;

import com.app.geometry.point2d.*;
import java.util.Scanner;

public class TestPointArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENETR NO OF POINT TO PLOT =");
		int noOFPoint = sc.nextInt();

		Point2D[] point = new Point2D[noOFPoint];

		for (int i = 0; i < point.length; i++) {
			point[i] = new Point2D();
		}

//		for (Point2D p : point) {
//			p=new Point2D();
//			
//		}

		for (Point2D p : point) {
			p.accept();
		}
		int choice = -1;
		int index;
		int endPoint;
		int beginPOint;

		do {
			System.out.println("*****************************************************************");
			System.out.println("1. Display details of a specific point");
			System.out.println("2. Display x, y co-ordinates of all points");
			System.out.println("3. User i/p : 2 indices for the points , validate the indices");
			System.out.println("4. EXIT");
			System.out.println("******************************************************************");
			System.out.println("ENTER YOUR CHOICE....");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("ENTER INDEX OF POINT TO DISPLAY = ");
				index = sc.nextInt();
				for (int i = 0; i < point.length; i++) {
					if (index > point.length && index < 0) {
						System.out.println("INVALID INDEX ,PLS RETRY.....");
						break;
					} else {
						point[index].display();
						break;
					}
				}
				break;

			case 2:
				for (Point2D p : point) {
					p.display();
				}
				break;

			case 3:
				System.out.println("ENTER THE INDEX OF POINT TO CALCULATE DISTANCE ");
				endPoint = sc.nextInt();
				beginPOint = sc.nextInt();
				point[endPoint].calculateDistance(point[beginPOint]);

				break;

			case 4:
				choice = 0;
				break;
			}

		} while (choice != 0);

	}

}
