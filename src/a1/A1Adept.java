package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int numItems = scan.nextInt();
		
		String[] inventory = new String[numItems];
		Double[] prices = new Double[numItems];
		
		for (int i = 0; i < numItems; i++) {
			inventory[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		
		int numCustomers = scan.nextInt();
		
		String[] firstNames = new String[numCustomers];
		String[] lastNames = new String[numCustomers];
		Double[] totals = new Double[numCustomers];
		
		for (int i = 0; i < numCustomers; i++) {
			
			firstNames[i] = scan.next();
			lastNames[i] = scan.next();
			int itemsBought = scan.nextInt();
			
			Double total = 0.0;
			
			for (int j = 0; j < itemsBought; j++) {
				
				Double quantity = scan.nextDouble();
				String itemBoughtName = scan.next();
				
				for (int k = 0; k < inventory.length; k++) {
					if (inventory[k].equals(itemBoughtName)) {
						total += prices[k] * quantity;
						
					}
				}
			}
			
			totals[i] = total;
		}
		
		Double sum = 0.0;
		
		for (int i = 0; i < totals.length; i++) {
			sum += totals[i];
		}
		
		Double currentMin = totals[0];
		int minIndex = 0;
		
		for (int i = 1; i < totals.length; i++) {
			if (totals[i] < currentMin) {
				currentMin = totals[i];
				minIndex = i;
			}
		}
		
		Double currentMax = totals[0];
		int maxIndex = 0;
		
		for (int i = 1; i < totals.length; i++) {
			if (totals[i] > currentMax) {
				currentMax = totals[i];
				maxIndex = i;
			}
		}
		
		
		System.out.println("Biggest: " + firstNames[maxIndex] + " " + lastNames[maxIndex] + " (" + String.format("%.2f", currentMax) + ")");
		System.out.println("Smallest: " + firstNames[minIndex] + " " + lastNames[minIndex] + " (" + String.format("%.2f", currentMin) + ")");
		System.out.println("Average: " + String.format("%.2f", (sum / numCustomers)));
		
		scan.close();
	}
}
