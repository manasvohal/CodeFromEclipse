package ConditonsAndControls;
import java.util.Scanner;
public class SwitchPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Taking input from the user to enter a number
		 *  Assigning that number to a variable
		 *  Using a switch statement to print out the cost that correlates to the user input
		 */
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 5");
		int mealNum = reader.nextInt();
		switch(mealNum) {
		case 1:
			System.out.println("Your cost is $4.45");
			break;
		case 2:
			System.out.println("Your cost is $5.12");
			break;
		case 3:
			System.out.println("Your cost is $5.77");
			break;
		case 4:
			System.out.println("Your cost is $6.54");
			break;
		case 5:
			System.out.println("Your cost is $7.25");
			break;
		default:
			System.out.println("Invalid Input");
		}
		
	}

}
