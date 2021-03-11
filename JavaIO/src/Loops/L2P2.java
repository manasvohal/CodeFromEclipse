package Loops;
import java.util.Scanner;
public class L2P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Asking the user to enter a number between 10 and 20
		// Using a for loop to print "hello" based of what the user inputed
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number between 10 and 20");
		int userNum = reader.nextInt();
		for(int i = 1; i<=userNum; i++) {
			System.out.println("hello");
	}

}
}
