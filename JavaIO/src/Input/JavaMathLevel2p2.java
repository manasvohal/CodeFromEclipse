package Input;
import java.util.Scanner;
public class JavaMathLevel2p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number");
		int numOne = reader.nextInt();
		System.out.println("Enter a number");
		int numTwo = reader.nextInt();
		System.out.println("Enter a number");
		int numThree = reader.nextInt();
		int firstTwo = Math.max(numOne, numTwo);
		int lastTwo = Math.max(firstTwo, numThree);
		System.out.println("Max number is: " + lastTwo);
				
	}

}
