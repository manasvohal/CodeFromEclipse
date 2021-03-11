package SwitchStatements;

public class L2P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Generating a number between 1 and 4 that corresponds with the 4 suits
		* Creating a suit variable to store the suit that corresponds with the number generated
		* Using a switch statement to use the number generated and assigning that number to a suit
		* Generating a number between 1 and 14 that corresponds with the 14 card numbers form A-K
		* Creating a cardNumber variable to store the suit that corresponds with the number generated
		* Using a switch statement to use the number generated and assigning that number to a cardNumber
		*/ 
		int suitRandomNumber = (int) (Math.random() * ((4-1)+ 1)) + 1;
		String suit = "";
		switch(suitRandomNumber) {
		case 1:
			suit = "Clubs";
			break;
		case 2:
			suit = "Hearts";
			break;
		case 3:
			suit = "Diamonds";
			break;
		case 4:
			suit = "Spades";
			break;
		}
		int cardRandomNumber = (int) (Math.random() * ((13-1)+ 1)) + 1;
		String cardNumber = "";
		switch(cardRandomNumber) {
		case 1:
			cardNumber = "Ace";
			break;
		case 2:
			cardNumber = "2";
			break;
		case 3:
			cardNumber = "3";
			break;
		case 4:
			cardNumber = "4";
			break;
		case 5:
			cardNumber = "5";
			break;
		case 6:
			cardNumber = "6";
			break;
		case 7:
			cardNumber = "7";
			break;
		case 8:
			cardNumber = "8";
			break;
		case 9:
			cardNumber = "9";
			break;
		case 10:
			cardNumber = "10";
			break;
		case 11:
			cardNumber = "Jack";
			break;
		case 12:
			cardNumber = "Queen";
			break;
		case 13:
			cardNumber = "King";
			break;
		default:
			System.out.println("Invalid Entry");
			break;
		}
		System.out.println(cardNumber + " of " + suit);
	}

}
