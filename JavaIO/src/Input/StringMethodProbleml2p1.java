package Input;
import java.util.Scanner;
public class StringMethodProbleml2p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a string");
		String userInput = reader.nextLine();
		System.out.println(userInput.substring(2)+userInput.substring(0,2));
	}

}
