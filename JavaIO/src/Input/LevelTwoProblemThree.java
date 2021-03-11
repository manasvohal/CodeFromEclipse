package Input;
import java.util.Scanner;
public class LevelTwoProblemThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Level Two Problem Three
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int dividend = reader.nextInt();
		int divisor = reader.nextInt();
		int quotient = dividend/divisor;
		int remainder = dividend%divisor;
		System.out.println("The quotient is "+ quotient + " and the remainder is "+remainder);
		
		
		
	}

}
