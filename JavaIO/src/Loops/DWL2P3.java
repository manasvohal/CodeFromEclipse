package Loops;
import java.util.Scanner;
public class DWL2P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a scanner class to take in user input
		// Asking the user to enter a positive integer and assigning that to a integer
		// Creating another integer that acts as the unit digits when extracting it
		// Using the calculations, the loop is extracting the user digits of the number entered and reversing it
		// Once done it prints out the reversed number of the integer
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int num = reader.nextInt();
		int reversedNum = 0;
		do {
			reversedNum *= 10;
			reversedNum += num%10;
			num/=10;
		} while(!(num%10==0));
		System.out.print(reversedNum);
	
	}

}
