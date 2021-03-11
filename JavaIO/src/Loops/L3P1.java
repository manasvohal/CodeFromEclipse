package Loops;
import java.util.Scanner;
public class L3P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Taking user input from the user
			Assigning the user input to a variable called num
			Creating a boolean variable that starts of as false since no divisor is found and during the for loop, 
			once a divisor is found for the number that was inputed from the user, the boolean variable turns to true and 
			prints a statement saying the number is not a prime number
			Creating a for loop which checks each divisible number starting with 2 and going on until the input 
			is divisible by anything else except 1 and the number itself.
			Creating an if condition that when the boolean variable is still false, it prints that the number is a prime number
		 */
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = reader.nextInt();
		boolean divisorForNumFound = false;
		for(int i = 2; i <= num/i; i++) {
			if(num%i==0) {
				System.out.println(num + " is not a prime number");
				divisorForNumFound = true;
				break;
			}
		}
		if(divisorForNumFound == false) {
			System.out.println(num + " is a prime number");
		}
	}

}
