package JavaArrays;
import java.util.Scanner;
public class L2P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a scanner class
		Scanner reader = new Scanner(System.in);
		// Creating an array with the fixed size of 50
		int[] numbers = new int[50];
		int counter = 0;
		// Creating a for loop that goes through each index, asks the question, and adds it to the array
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Enter a number");
			numbers[i] = reader.nextInt();
			counter++;
			// Using an if condition to check if the number entered was a negative number, and if so it breaks the loop
			if(numbers[i] < 0) {
				counter--;
				break;
			}
		}
		System.out.println("Physical size: "+numbers.length+"\nLogical Size: "+counter);
	}

}
