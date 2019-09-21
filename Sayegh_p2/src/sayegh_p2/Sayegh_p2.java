package sayegh_p2;

import java.util.Scanner;

public class Sayegh_p2 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int choice;
		int weightInPounds, heightInInches;
		double weightInKilograms, heightInMeters;
		double bmi = 0;
		System.out.println("1. Standard BMI\n2. Metric BMI");
		choice = scnr.nextInt();
		if( choice == 1) {
			System.out.print("Please Enter Your Weight in Pounds: ");
			weightInPounds = scnr.nextInt();
			System.out.print("Please Enter Your height in Inches: ");
			heightInInches = scnr.nextInt();
			
			bmi = (703 * weightInPounds)/(Math.pow(heightInInches, 2));
		}
		if( choice == 2) {
			System.out.print("Please Enter Your Weight in Kilograms: ");
			weightInKilograms = scnr.nextDouble();
			System.out.print("Please Enter Your height in Meters: ");
			heightInMeters = scnr.nextDouble();
			
			bmi = (weightInKilograms)/(Math.pow(heightInMeters, 2));
		}
		
		System.out.println("Your BMI is: " +bmi);
		System.out.println("BMI categories:");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5-24.9");
		System.out.println("Overweight = 25-29.9");
		System.out.println("Obesity = BMI of 30 or greater");
	
		

	}

}
