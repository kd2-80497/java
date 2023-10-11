package com.app.fruits;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		System.out.println("ENTER THE NUMBER OF FRUITS YOU WANT =");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Fruits basket[] = new Fruits[num];
		int choice;
		int counter = 0;
		int index;

		do {
			System.out.println("0.EXIT");
			System.out.println("1.ADD MANGO");
			System.out.println("2.ADD ORANGE");
			System.out.println("3.ADD APPLE");
			System.out.println("4.Display names of fruit");
			System.out.println("5. NAME COLOR WEIGHT");
			System.out.println("6.DISPLAY taste of  STALE FRUITS");
			System.out.println("7.MARK A FRUIT AS STALE");
			System.out.println("8.Mark all sour fruit as Stale");
			System.out.println("Enter choice....");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				if (counter < num) {
					basket[counter] = new Mango();

					basket[counter].accept();

					counter++;
				}
				break;
			case 2:
				if (counter < num) {
					basket[counter] = new Orange();
					basket[counter].accept();
					counter++;
				}
				break;
			case 3:
				if (counter < num) {
					basket[counter] = new Apple();
					basket[counter].accept();
					counter++;
				}
				break;

			case 4:
				for (Fruits fruit : basket) {
					if(fruit!=null) {
					String name = fruit.getName();
					System.out.println(name);
					}
				}
				break;

			case 5:
				System.out.println("Enter index ");
				for (Fruits fruit : basket) {
					if(fruit!=null) {
					if (fruit.isFresh()) {
						String details = fruit.toString();
						System.out.println(details);
					} else {
						System.out.println("FRUIT  IS FRESH..");
					}
					}

				}

				break;
			case 6:
				for (Fruits fruit : basket) {
					if (fruit.isFresh()) {

						System.out.println("ALL FRUIT  ARE  FRESH..");
						break;
					} else {
						String taste = fruit.taste();
						System.out.println(taste);
						break;
					}
				}
				break;
			case 7:
				System.out.println("Enter index to ");
				index = sc.nextInt();
				if (index > counter && counter < 0) {
					System.out.println("Invalid index....");
				} else {
					basket[index].setFresh(false);
					break;
				}
				break;

			case 8:
				for (Fruits fruit : basket) {
					if (fruit.taste() == "sour") {
						fruit.setFresh(false);
					}
				}
				break;

			}

		} while (choice != 0);

	}

}
