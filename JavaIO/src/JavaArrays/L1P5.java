package JavaArrays;
import java.util.Scanner;
public class L1P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating Scanner class to take in user input
		Scanner reader = new Scanner(System.in);
		// Created a blank array that has a fixed size of 20
		int[] num = new int[20];
		// Created a counting variable to see how many times the user entered a non-negative number
		int i = 0;
		// Created another counting variable so that when the user enters a negative number, it counts to the total
		int negativeCount = 0;
		// Using a for loop where i is used as the index, its less than the arrays length
		for(i = 0; i < num.length; i++) {
			// Asking user to enter a number
			System.out.println("Enter a number");
			// Adding the input to the array at which the index is at
			num[i] = reader.nextInt();
			//Checking to see if the number -1 was entered at the index
			if(num[i] == -1) {
				System.out.println("You entered -1");
				break;
			}
			//If the number entered was less than 0, then the counting variable goes up by 1
			if(num[i] < 0) {
				negativeCount++;
			}
			
		}
		// Printing out the total number of non-negative numbers 
		System.out.println("You have entered " + (i-negativeCount) + " nonnegative numbers");	
		
		
		
	}

}
