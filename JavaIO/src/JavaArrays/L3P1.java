package JavaArrays;
import java.util.Scanner;
import java.util.Arrays;
public class L3P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaring scanner class to take in user input
		Scanner reader = new Scanner(System.in);
		// Creating a fixed size array
		int[] randomNum = new int[20];
		// Creating a variable that will act as the specific index
		int index = 0;
		// Created boolean variable to act as when number is found
		boolean numFound = false;
		// First for loop that will fill the array with random numbers
		for(int i = 0; i < randomNum.length; i++) {
			randomNum[i] = (int) (Math.random() * (30 - 1) + 1);
		}
		// Printing the array
		System.out.println(Arrays.toString(randomNum));
		// Asking user to find a number in the array
		System.out.println("Enter a number you want to find in the array");
		int numberToBeFound = reader.nextInt();
		// For loop that will try to find the specific number
		for(int j = 0; j < randomNum.length; j++) {
			if(randomNum[j] == numberToBeFound) {
				index = j;
				numFound = true;
				System.out.println("Index: " + index);
			}
		} // If number is not found print -1
		if(numFound == false) {
			System.out.println("-1");
		}

	}
}
