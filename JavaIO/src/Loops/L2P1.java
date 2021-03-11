package Loops;
import java.util.Scanner;
public class L2P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Generating a random number and storing it in a integer
		// Creating a scanner variable and using that to take user input
		// User inputs a guess, if its high, it prints lower and likewise for the other way around
		// If guesses equals 7, then it says that the user ran out of guesses and prints what the number was
		int randomNumber = 1 + (int) (Math.random() * ((100-1) + 1) + 1);
		Scanner reader = new Scanner(System.in);
		System.out.println("Guess the number");
		for(int guessCount = 1; guessCount<=7; guessCount++) {
			int guess = reader.nextInt();
			if(guess == randomNumber) {
				System.out.println("You guessed the right number: " + randomNumber);
				break;
			}
			else if(guess > randomNumber){
				System.out.println("Lower");
			}
			else {
				System.out.println("Higher");
			}
			if(guessCount == 7) {
				System.out.println("You have ran out of guesses, the number was " + randomNumber);	
			}
		}
			
	}
}


