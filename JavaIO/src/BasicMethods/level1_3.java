package BasicMethods;
import java.util.Scanner;
public class level1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calling the method in the main method to print it out
		arithmetic();
	}
	// Mehod to do all the caculations with the numbers entered
	public static void arithmetic() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number");
		int numOne = reader.nextInt();	
		System.out.println("Enter a number");
		int numTwo = reader.nextInt();	
		System.out.println(numOne + numTwo);
		System.out.println(numOne - numTwo);
		System.out.println(numOne * numTwo);
		System.out.println(numOne / numTwo);
		System.out.println(numOne % numTwo);
	}

}
