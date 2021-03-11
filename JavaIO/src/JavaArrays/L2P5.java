package JavaArrays;
import java.util.Scanner;
public class L2P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating scanner variable to take in user input
		Scanner reader = new Scanner(System.in);
		// Asking user to input a string that is separated by commas
		System.out.println("Enter double numbers separated by a comma");
		// Storing that string in a variable
		String userNum = reader.nextLine();
		// using .split method to separate the numbers and put them in an array
		String[] data = userNum.split(",");
		// Creating a double variable that will act as our running sum
		double total = 0;
		// Copying the length of the array to a copy array
		double[] doubleCopyArray = new double[data.length];
		// Using for loop to transfer the elements from the string array to a converted double array
		for(int i = 0; i < doubleCopyArray.length; i++) {
			doubleCopyArray[i] = Double.parseDouble(data[i]);
		}
		// Using this for loop to add up all the elements in the array
		for(int j = 0; j < doubleCopyArray.length; j++) {
			total += doubleCopyArray[j];
		}
		// Displaying the elements in the array
		System.out.println("The average of the numbers in the array is: " + (total/doubleCopyArray.length));
	}

}
