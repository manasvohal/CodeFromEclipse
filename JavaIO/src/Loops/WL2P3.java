package Loops;
import java.util.Scanner;
public class WL2P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number, enter -999 to stop the loop");
		int userNum = reader.nextInt();
		int runningSum = 0;
		while(userNum != -999) {
			runningSum += userNum;
			System.out.println("Enter a number, enter -999 to stop the loop");
			userNum = reader.nextInt();
		}
		System.out.println("The total is " + runningSum);
	}

}
