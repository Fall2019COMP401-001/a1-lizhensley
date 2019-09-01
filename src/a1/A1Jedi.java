package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		String[] inventory = new String[scan.nextInt()];
		int[] numInventoryBought = new int[inventory.length];
		int[] numCustomersBought = new int[inventory.length];
		
		for(int i = 0; i < inventory.length; i++) {
			inventory[i] = scan.next();
			scan.nextDouble();
		}
		
		int numCustomers = scan.nextInt();
		
		Boolean[][] arr = new Boolean[inventory.length][numCustomers];
		
		for (int i = 0; i < numCustomers; i++) {
			scan.next();
			scan.next();
			int numItemsBought = scan.nextInt();
			
			for (int j = 0; j < numItemsBought; j++) {
				
				int itemCount = scan.nextInt();
				String item = scan.next();
				
				for (int k = 0; k < inventory.length; k++) {
					if (inventory[k].equals(item)) {
						numInventoryBought[k] += itemCount;
						if (!(arr[k][i])) {
							arr[k][i] = true;
						}
					}
				}
			}
			
		}
		
		for (int i = 0; i < inventory.length; i++) {
			for (int j = 0; j < numCustomers; j++) {
				if (arr[i][j]) {
					numCustomersBought[i]++;
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
			if (which[i].equals(name)) {
				answer = false;
			}
		}
		
		return answer;
	}
	
}
