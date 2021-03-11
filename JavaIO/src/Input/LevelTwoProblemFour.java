package Input;
import java.util.Scanner;
public class LevelTwoProblemFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Level Two Problem Four
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the date, the month, and the year you were born");
		int date = reader.nextInt();
		int month = reader.nextInt();
		int year = reader.nextInt();
		System.out.println("You were born on " + month+"/"+date+"/"+year);
	}

}
