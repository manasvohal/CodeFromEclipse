import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int currentNumber = 0;
		System.out.println("How many elements do you want the array to contain");
		int size = reader.nextInt();
		int[] numbers = new int[size];
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Enter a number");
			numbers[i] = reader.nextInt();
		}
		System.out.println(Arrays.toString(numbers));
		
		for(int i = 0; i < numbers.length-1; i++) {
			if(numbers[i] > numbers[i+1]) {
				currentNumber = numbers[i];
				numbers[i] = numbers[i+1];
				numbers[i+1] = currentNumber;
				i = -1;
			}
		}
		System.out.println(Arrays.toString(numbers));
		
	}

}
