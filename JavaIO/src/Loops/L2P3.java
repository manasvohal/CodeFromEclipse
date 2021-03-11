package Loops;
import java.util.Scanner;
public class L2P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// user inputs a limit number, then it starts at 2 and counts by 3 until it hits the limit
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a limit number");
		int limit = reader.nextInt();
		for(int i = 2; i <= limit; i+=3) {
			System.out.println(i);
		}
	}

}
