package Loops;
import java.util.Scanner;
public class L3P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Taking input from the user for two integers
			Assigning those two integers to variables
			Creating an integer called gcf(Greatest Common Factor) and initializing it to 1(Since both integers can always be 
			divided by 1.
			Creating a for loop that starts of at 1, checks to see if i is less than the two numbers that were 
			inputed by the user an it increments by 1
			Then inside the for loop is an if condition that checks to see if both numbers divided by i is remainder is equal to 0
			Then it makes the greatest common factor to store i until the highest number is met
			Then it outputs what the greatest common factor is.

		 */
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter an integer");
		int numOne = reader.nextInt();
		System.out.println("Enter an integer");
		int numTwo = reader.nextInt();
		int gcf = 1;
		for(int i = 1; i <= numOne && i <= numTwo; i++)  {
			if(numOne%i==0 && numTwo%i==0) {
				gcf = i;
			}
		  }
		  System.out.println("The greatest common factor for the numbers is: " + gcf);
		
	}
}


