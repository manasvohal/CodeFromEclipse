package Loops;
import java.util.Scanner;
public class WL2P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter");
		int amountNum = reader.nextInt();
		int count = 1;
		int runningSum = 0;
		while(count <= amountNum) {
			System.out.println("Enter a number");
			int userNum = reader.nextInt();
			runningSum += userNum;
			count++;
		}
		System.out.println("The average between the numbers is " + (runningSum/amountNum));
	}

}
