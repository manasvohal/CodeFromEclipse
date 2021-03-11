package Loops;
import java.util.Scanner;
public class WL2P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int randomNumber = (int) (Math.random() * (10-1) + 1); 
		int guessCount = 1;
		while(guessCount <= 3) {
			System.out.println("Enter a number between 1 and 10");
			int guess = reader.nextInt();
			if(guess == randomNumber) {
				System.out.println("Great Job! You guessed the number");
			}
			else if(guess > randomNumber){
				System.out.println("Lower");
			}
			else {
				System.out.println("Higher");
			}
			guessCount++;
		}
		System.out.println("The number was " + randomNumber);
	}

}
