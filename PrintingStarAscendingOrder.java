package com.xworkz.patternproblemex;

public class PrintingStarAscendingOrder {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("Printing Patterns");
		
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}