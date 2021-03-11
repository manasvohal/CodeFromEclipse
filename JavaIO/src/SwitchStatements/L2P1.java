package SwitchStatements;

public class L2P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Using Math.random to generate two numbers representing the dice numbers
		* Taking the sum of the dice rolls and storing it to a variable
		* Using a switch statement to check each sum and say if it set as the point or if they win or lose
		*/
		int diceNumberOne = (int) (Math.random() * ((6-1)+ 1)) + 1;
		int diceNumberTwo = (int) (Math.random() * ((6-1)+ 1)) + 1;
		int sumOfNum = diceNumberOne + diceNumberTwo;
		System.out.println(sumOfNum);
		switch(sumOfNum) {
		case 2:
			System.out.println("You instantly lose");
			break;
		case 3:
			System.out.println("3 is set as the point");
			break;
		case 4:
			System.out.println("4 is set as the point");
			break;
		case 5:
			System.out.println("5 is set as the point");
			break;
		case 6:
			System.out.println("6 is set as the point");
			break;
		case 7:
			System.out.println("You instantly win!");
			break;
		case 8:
			System.out.println("8 is set as the point");
			break;
		case 9:
			System.out.println("9 is set as the point");
			break;
		case 10:
			System.out.println("You instantly lose!");
			break;
		case 11:
			System.out.println("You instantly win!");
			break;
		case 12:
			System.out.println("12 is set as the point");
			break;
		default:
			System.out.println("Invalid Entry");
		}
	}

}
