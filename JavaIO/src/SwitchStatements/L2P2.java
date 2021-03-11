package SwitchStatements;
import java.util.Scanner;
public class L2P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Declaring a scanner variable to take in user input of 2 numbers and a letter
		* Using the letters that was inputed from the user, A corresponds with addition and so long
		* Either adding, subtracting, multiplying, or dividing the two numbers entered and outputting it
		* For Case D, I added an if else condition to check if the second number is 0 since you cannot divide by 0
		*/
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter an integer");
		int numOne = reader.nextInt();
		System.out.println("Enter an integer");
		int numTwo = reader.nextInt();
		System.out.println("Enter a letter which is A,S,M,D");
		reader.nextLine();
		String operator = reader.nextLine();
		switch(operator) {
		case "A":
			System.out.println(numOne + numOne);
			break;
		case "S":
			System.out.println(numOne - numTwo);
			break;
		case "M":
			System.out.println(numOne * numTwo);
			break;
		case "D":
			if(numTwo == 0) {
				System.out.println("Can't divide by 0");
			}
			else {
				System.out.println(numOne/numTwo);
			}
			break;
		default:
			System.out.println("Invalid Entry");
			break;
		}
	}

}
