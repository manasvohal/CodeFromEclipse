package Loops;
import java.util.Scanner;
public class L1P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number between 10 and 20");
		int userNum = reader.nextInt();
		for(int i = 1; i<=userNum; i++) {
			System.out.println("Java");
		}
	}

}
