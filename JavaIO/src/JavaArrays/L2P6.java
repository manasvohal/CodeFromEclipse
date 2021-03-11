package JavaArrays;
import java.util.Arrays;
public class L2P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating an array with the fixed size of 15
		int[] randomNum = new int[15];
		// Creating variable that will act as the index of the array
		int index = 0;
		// for loop to generate random numbers and fill them in the array
		for(int i = 0; i < randomNum.length; i++) {
			randomNum[i] = (int) (Math.random() * (100 - 1) + 1);
		}
		// printing out the array with the random numbers using the Arrays.toString method
		System.out.println(Arrays.toString(randomNum));
		// Creating a variable that will start at the first index to imply that it is the smallest number in the array
		int currentSmallestNumber = randomNum[0];
		// for loop that will check through each index of the array, if the index is smaller than the current smallest number, it will replace it
		for(int i =0;i<randomNum.length;i++) {
			if(randomNum[i]<currentSmallestNumber) {
				currentSmallestNumber = randomNum[i];
				index = i;
			}
		}
		// Printing out the smallest number in the array while also printing the index of where that number is located
		System.out.println("The smallest number in the array is " + currentSmallestNumber + " at index " + index);
	}

}
