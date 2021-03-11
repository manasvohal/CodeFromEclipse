package JavaArrays;
import java.util.Arrays;
public class ArraysMP01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a fixed String array with the size 52
		String[] deck = new String[52];
		// Count will act for each number 1-13
		int count = 0;
		// Suit round when incremented will change the suit
		int suitRound = 1;
		String letterCard = "";
		// Starting the suit with Spades
		String suit = "S";
		// For loop which will add the cards to the deck
		for(int i = 0; i < deck.length; i++) {
			count++;
			// Switch statement when count is equal to either 1,11,12,13 , the corresponding letter will be filled instead
			switch(count) {
			case 1:
				letterCard = "A";
				deck[i] = letterCard + suit;
				break;
			case 11:
				letterCard = "J";
				deck[i] = letterCard + suit;
				break;
			case 12:
				letterCard = "Q";
				deck[i] = letterCard + suit;
				break;
			case 13:
				letterCard = "K";
				deck[i] = letterCard + suit;
				count = 0;
				suitRound++;
				break;
			default:
				deck[i] = count + suit;
				break;
			}// Changing the suit based on the suit round
			if(suitRound == 2) {
				suit = "H";
			}
			if(suitRound == 3) {
				suit = "C";
			}
			if(suitRound == 4) {
				suit = "D";
			}
		}
		// Creating a hand array
		String[] hand = new String[5];
		// Nested for loop with a do while loop to add the card to the hand and change the value in the index to null
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < hand.length; j++) {
				do{
					int randomNumIndex = (int) (Math.random() *51);
					hand[j] = deck[randomNumIndex];
					deck[randomNumIndex] = null;
				} while(hand[j] == null);
			}
			// Printing out the hand five times
			System.out.println("Player " + i + ": " + Arrays.toString(hand)); 
		}
	}

}
