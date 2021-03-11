package Input;
import java.util.Scanner;
public class LevelTwoProblem0ne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Level Two Problem One
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter Three Double Numbers");
		double numOne = reader.nextDouble();
		double numTwo = reader.nextDouble();
		double numThree = reader.nextDouble();
		double average = (numOne+numTwo+numThree)/3;
		System.out.println("The average is " + average);
	}

}
