package Loops;
import java.util.Scanner;
public class L2P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Asking the user to input how many numbers they want to average
		// Using a for loop, it asks the user to input a number based from what the user inputed and then averages that by the use of a running sum
		Scanner reader = new Scanner(System.in);
		double sumOfNumbers = 0;
		System.out.println("Enter the amount of numbers that you want to average");
		int amount = reader.nextInt();
		for(double i = 1; i <= amount; i++) {
			System.out.println("Enter a number");
			double num = reader.nextInt();
			sumOfNumbers = sumOfNumbers + num;
		}
		double average = sumOfNumbers / amount;
		System.out.println("The average is " + average);
	}

}
