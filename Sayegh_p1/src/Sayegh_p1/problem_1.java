package Sayegh_p1;

import java.util.Scanner;

public class problem_1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		int digit1, digit2, digit3, digit4;
		int cdigit1, cdigit2, cdigit3, cdigit4;

		System.out.println("please input the first digit of your code");
		digit1 = scnr.nextInt();
		System.out.println("please input the second digit of your code");
		digit2 = scnr.nextInt();
		System.out.println("please input the third digit of your code");
		digit3 = scnr.nextInt();
		System.out.println("please input the fourth digit of your code");
		digit4 = scnr.nextInt();
		
		System.out.println("You entered: " + digit1 + digit2 + digit3 + digit4 ); 
		
		cdigit3 = (digit1 + 7) % 10;
		cdigit4 = (digit2 + 7) % 10;
		cdigit1 = (digit3 + 7) % 10;
		cdigit2 = (digit4 + 7) % 10;
		

		System.out.print("Encrpyted code is: " + cdigit1 + cdigit2 + cdigit3 + cdigit4 ); 
		
		
	}

}
