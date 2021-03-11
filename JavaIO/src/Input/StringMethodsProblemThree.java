package Input;
import java.util.Scanner;
public class StringMethodsProblemThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a string:");
		String userInput = reader.nextLine();
		String output = (userInput.substring(0,1).toLowerCase());
		System.out.println(output + userInput.substring(1));
		
	}

}
