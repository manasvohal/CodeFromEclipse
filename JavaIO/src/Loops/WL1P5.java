package Loops;
import java.util.Scanner;
public class WL1P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a string that is 5 characters or longer");
		String userString = reader.nextLine();
		while(userString.length() == 5) {
			System.out.println("Enter a string that is 5 characters or longer");
			userString = reader.nextLine();
		}
	}

}
