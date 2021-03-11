package Input;
import java.util.Scanner;
public class LevelTwoProblemTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Level Two Problem Two
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = reader.nextInt();
		System.out.print("Enter your name: ");
		reader.nextLine();
		String userName = reader.nextLine();
		System.out.println("Your age is " + age + " and your name is "+ userName);
	}

}
