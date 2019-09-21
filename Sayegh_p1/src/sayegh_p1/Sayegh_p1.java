package sayegh_p1;

import java.util.Scanner;

public class Sayegh_p1 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner (System.in);
		int digit1, digit2, digit3, digit4;
		int bdigit1, bdigit2, bdigit3, bdigit4;
		int length;

		System.out.println("please input the first digit of your code");
		digit1 = scnr.nextInt();
		
		while( digit1 >= 10 ){
			System.out.println("please input the first digit of your code");
			digit1 = scnr.nextInt();
		}
	
		System.out.println("please input the second digit of your code");
		digit2 = scnr.nextInt();
		
		while( digit2 >= 10 ){
			System.out.println("please input the second digit of your code");
			digit2 = scnr.nextInt();
		}
		
		System.out.println("please input the third digit of your code");
		digit3 = scnr.nextInt();
		
		while( digit3 >= 10 ){
			System.out.println("please input the third digit of your code");
			digit3 = scnr.nextInt();
		}
		
		System.out.println("please input the fourth digit of your code");
		digit4 = scnr.nextInt();
		
		while( digit4 >= 10 ){
			System.out.println("please input the fourth digit of your code");
			digit4 = scnr.nextInt();
		}
		
		System.out.println("You entered: " + digit1 + digit2 + digit3 + digit4 ); 
		
		bdigit3 = (digit1 + 7) % 10;
		bdigit4 = (digit2 + 7) % 10;
		bdigit1 = (digit3 + 7) % 10;
		bdigit2 = (digit4 + 7) % 10;
		

		System.out.print("Encrpyted code is: " + bdigit1 + bdigit2 + bdigit3 + bdigit4 ); 
		


	}

}
