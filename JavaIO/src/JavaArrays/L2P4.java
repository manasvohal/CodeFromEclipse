package JavaArrays;
import java.util.Scanner;
public class L2P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating scanner variable to take in user input
		Scanner reader = new Scanner(System.in);
		// Asking them what they want the size to be
		System.out.println("What do you want the size of the array to be");
		// Creating an int value for the user input
		int sizeOfArray = reader.nextInt();
		// Declaring the size of the String array using user input
		String[] nameArray = new String[sizeOfArray];
		System.out.println("Enter values");
		// For loop allows to fill the array with the names
		for(int i = 0; i < nameArray.length; i++) {
			nameArray[i] = reader.next();
		}
		// for each loop to print out the names in the array
		for(String name: nameArray) {
			System.out.println(name);
		}
	}
}
