package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int numCustomers = scan.nextInt();
		
		for (int i = 0; i < numCustomers; i++) {
			
			String firstName = scan.next();
			String lastName = scan.next();
			int numItems = scan.nextInt();
			
			Double total = 0.00;
			
			for (int j = 0; j < numItems; j++) {
				
				int quantity = scan.nextInt();
				String itemName = scan.next();
				Double price = scan.nextDouble();
				total += price * quantity;
				
			}
			
			System.out.println(firstName.charAt(0) + ". " + lastName + ": " + total);
			
		}
		
	}
}
