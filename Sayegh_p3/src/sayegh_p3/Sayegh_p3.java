package sayegh_p3;

import java.util.Scanner;

public class Sayegh_p3 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String[] topics = {"Chipotle" , "Chickfila" , "McDonald's" , "Wendy's", "Burger King"};
		int responses[][] = new int[5][10];
		int sums[] = new int[5];
		int avg[] = new int[5];
		int chipSum = 0;
		int chikSum = 0;
		int mcdoSum = 0;
		int wndySum = 0;
		int burgSum = 0;
		
		int c = 0;
		int d = 0;
		int choice = 0;
		int j = 0;
		int maxVal = 0;		
		int minVal = 100000;
		
		sums[0] = chipSum;
		sums[1] = chikSum;
		sums[2] = mcdoSum;
		sums[3] = wndySum;
		sums[4] = burgSum;
		
		double chipAvg = 0;
		double chikAvg = 0;
		double mcdoAvg = 0;
		double wndyAvg = 0;
		double burgAvg = 0;
		
		System.out.println("Rate the following Restaurants on customer service from 1-10");
		
		for (int i=0; i<10 ; i++) {
			System.out.println("Hello!");
			System.out.println("How would you rate the following restuarants based on customer Service");
			
			System.out.println("Rating for chipotle");
			responses[0][i] = scnr.nextInt();
			while (responses[0][i] > 9 || responses[0][i] < 1) {
				System.out.println("Rating for chipotle");
				responses[0][i] = scnr.nextInt();
				}
			System.out.println("Rating for Chickfila");
			responses[1][i] = scnr.nextInt();
			while ( responses[1][i] > 9 || responses[1][i] < 1) {
				System.out.println("Rating for Chickfila");
				responses[1][i] = scnr.nextInt();
				}
			System.out.println("Rating for McDonald's");
			responses[2][i] = scnr.nextInt();
			while ( responses[2][i] > 9 || responses[2][i] < 1) {
				System.out.println("Rating for McDonald's");
				responses[2][i] = scnr.nextInt();
				}
			System.out.println("Rating for Wendy's");
			responses[3][i] = scnr.nextInt();
			while ( responses[3][i] > 9 || responses[3][i] < 1) {
				System.out.println("Rating for Wendy's");
				responses[3][i] = scnr.nextInt();
				}
			System.out.println("Rating for Burger King");
			responses[4][i] = scnr.nextInt();
			while ( responses[4][i] > 9 || responses[4][i] < 1) {
				System.out.println("Rating for Burger King");
				responses[4][i] = scnr.nextInt();
				}
			System.out.println("Thank you!"); 
			System.out.println("Would you like to take another survey?");
			System.out.println("1 for Yes\n2 for No");
			choice = scnr.nextInt();
			while( choice > 2 || choice < 1 ) {
				System.out.println("Would you like to take another survey?");
				System.out.println("1 for Yes\n2 for No");
				choice = scnr.nextInt();
			}
			if(choice == 1) {
				j ++;
				continue;
			}
			if(choice == 2) {
				j++;
				break;
			}
			
			}
		
		
		for (int i=0; i<10; i++) {
			sums[0] += responses[0][i];
			sums[1] += responses[1][i];
			sums[2] += responses[2][i];
			sums[3] += responses[3][i];
			sums[4] += responses[4][i];
		}
		
		
		
		chipAvg = sums[0]/j; 
		chikAvg = sums[1]/j;
		mcdoAvg = sums[2]/j;
		wndyAvg = sums[3]/j;
		burgAvg = sums[4]/j;
		
		
		
		System.out.println("  Results:");
		System.out.print("   Chipotle|");
		for(int i=0; i<10; i++) {
			System.out.print(responses[0][i] + " ");
		}
		System.out.println("\t Average: " + chipAvg);
		System.out.print("Chick-fil-A|");
		for(int i=0; i<10; i++) {
			System.out.print(responses[1][i]  + " ");
		}
		System.out.println("\t Average: " + chikAvg);
		System.out.print(" McDonald's|"); 
		for(int i=0; i<10; i++) {
			System.out.print(responses[2][i]  + " ");
		}
		System.out.println("\t Average: " + mcdoAvg);
		System.out.print("    Wendy's|");
		for(int i=0; i<10; i++) {
			System.out.print(responses[3][i]  + " "); 
		}
		System.out.println("\t Average: " + wndyAvg);
		System.out.print("Burger King|");
		for(int i=0; i<10; i++) {
			System.out.print(responses[4][i]  + " ");
		}	
		System.out.println("\t Average: " + burgAvg);
		
		
		
		
		for ( j=0; j<5; j++) {
			if (sums[j] > maxVal) {
				maxVal = sums[j];
				c = j;
			}
		}
		if ( c == 0 ) {
			System.out.println("The highest point total was Chipotle with: " + maxVal );
		}
		if( c == 1 ) {
			System.out.println("The highest point total was Chick-fil-A with: " + maxVal );
		}
		if( c == 2 ) {
			System.out.println("The highest point total was McDonald's with: " + maxVal );
		}
		if( c == 3 ) {
			System.out.println("The highest point total was Wendy's with: " + maxVal );
		}
		if( c == 4 ) {
			System.out.println("The highest point total was Burger Kind with: " + maxVal );
		}
		
		
		for ( j=0; j<5; j++) {
			if (sums[j] < minVal) {
				minVal = sums[j];
				d = j;
			}
		}
		
		if ( d == 0 ) {
			System.out.println("The lowest point total was Chipotle with: " + minVal );
		}
		if( d == 1 ) {
			System.out.println("The lowest point total was Chick-fil-A with: " + minVal );
		}
		if( d == 2 ) {
			System.out.println("The lowest point total was McDonald's with: " + minVal );
		}
		if( d == 3 ) {
			System.out.println("The lowest point total was Wendy's with: " + minVal );
		}
		if( d == 4 ) {
			System.out.println("The lowest point total was Burger Kind with: " + minVal );
		}
		

	}

}
