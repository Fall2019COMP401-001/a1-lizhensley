package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int numItems = scan.nextInt();
		String[] inventory = new String[numItems];
		int[] numInventoryBought = new int[numItems];
		int[] numCustomersBought = new int[numItems];
		
		for(int i = 0; i < numItems; i++) {
			inventory[i] = scan.next();
			scan.nextInt();
		}
		
		int numCustomers = scan.nextInt();
		String[] whichCustomersBought = new String[numCustomers];
		
		for (int i = 0; i < numCustomers; i++) {
			scan.next();
			String lastName = scan.next();
			int numItemsBought = scan.nextInt();
			
			for (int j = 0; j < numItemsBought; j++) {
				
				int itemCount = scan.nextInt();
				String item = scan.next();
				
				for (int k = 0; k < inventory.length; k++) {
					if (inventory[k] == item) {
						numInventoryBought[k] += itemCount;
						if (!isContained(whichCustomersBought, lastName)) {
							numCustomersBought[k]++;
						}
					}
				}
			}
			
		}
		
		for(int i = 0; i < inventory.length; i++) {
			if (numInventoryBought[i] == 0) {
				System.out.println("No customers bought " + inventory[i]);
			} else {
				System.out.println(numCustomersBought[i] + " customers bought " + numInventoryBought[i] + inventory[i]);
			}
		}
		
		
		scan.close();
		
	}
	
	static Boolean isContained(String[] which, String name) {
		
		Boolean answer = true;
		
		for (int i = 0; i < which.length; i++) {
			if (which[i] == name) {
				answer = false;
			}
		}
		
		return answer;
	}
}
