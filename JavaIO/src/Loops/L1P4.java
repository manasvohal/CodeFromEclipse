package Loops;
import java.util.Scanner;
public class L1P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOfNumbers = 0;
		Scanner reader = new Scanner(System.in);
		for(int i = 1; i<=9; i++) {
			System.out.println("Enter a number");
			int num = reader.nextInt();
			sumOfNumbers = sumOfNumbers + num;
		}
		System.out.println("The total is: " + sumOfNumbers);
	}

}
