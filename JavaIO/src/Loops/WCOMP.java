package Loops;
import java.util.Scanner;
public class WCOMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a scanner class to take in user input
		// Assigning that input to the userInput(which is the limit)
		// Creating and initializing a sum variable to store the divisors
		// Creating a nested for loop, first one is the one where it starts of at 1
		// Ends at the userInput(the limit) and it increments by 1
		// The second for loop is for the divisors which increment by 1
		// Then it checks if the number and the divisor can actually be divided
		// and if yes, it adds it to the running sum
		// Then it checks if the sum if greater than the count variable
		// also checks to see if the increment value is odd
		// If both conditions are true, it prints it
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter an integer");
		int userInput = reader.nextInt();
		int sumOfDivisors = 0;
		for(int x = 1; x <= userInput; x++) {
			for(int y = 1; y<= x/2; y++) {
				if(x%y==0) {
					sumOfDivisors += y;
				}
			}
			if(sumOfDivisors > x) {
				if(x%2!=0) {
					System.out.println(x);
				}
			}
			sumOfDivisors = 0;
		}
	
		
		
	}
}
