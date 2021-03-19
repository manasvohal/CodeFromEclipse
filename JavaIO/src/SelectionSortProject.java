import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int currentNumber = 0;
		System.out.println("How many elements do you want the array to contain");
		int size = reader.nextInt();
		System.out.println("Do you want to put it in asscending or desscending order");
		reader.nextLine();
		String answer = reader.nextLine();
		
		int[] numbers = new int[size];
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Enter a number");
			numbers[i] = reader.nextInt();
		}
		System.out.println(Arrays.toString(numbers));
		if(answer.equals("a")) {
			for(int i = 0; i < numbers.length-1; i++) {
				if(numbers[i] > numbers[i+1]) {
					currentNumber = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = currentNumber;
					i = -1;
				}
			}
		}
		else if(answer.equals("d")) {
			for(int i = 0; i < numbers.length-1; i++) {
				if(numbers[i] < numbers[i+1]) {
					currentNumber = numbers[i+1];
					numbers[i+1] = numbers[i];
					numbers[i] = currentNumber;
					i = -1;
				}
			}
		}
		
		System.out.println(Arrays.toString(numbers));
	}



	}


