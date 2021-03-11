package Loops;
import java.util.Scanner;
public class WL2P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int randomNumOne = (int) (Math.random() * (13-1) + 1); 
		int randomNumTwo = (int) (Math.random() * (13-1) + 1); 
		int total = randomNumOne + randomNumTwo;
		System.out.println("Your total is " + total);
		while(total <= 21) {
			System.out.println("Press HIT to draw another card");
			String answer = reader.nextLine();
			int newRandom = (int) (Math.random() * (13-1) + 1); 
			total += newRandom;
			System.out.println("Your total is " + total);
			if(total > 21) {
				System.out.println("BUST");
			}
		}
	}

}
