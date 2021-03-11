package JavaArrays;
import java.util.Scanner;
public class L2P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating scanner class to take in user input
		Scanner reader = new Scanner(System.in);
		// Creating and setting the size of the char array
		char[] characters = new char[35];
		// Creating a count variable
		int count = 0;
		// For loop that allows the user to input an upper case letter, if it is upper case, the counter goes up, and if it isn't it breaks the loop
		for(int i = 0; i < characters.length; i++) {
			System.out.println("Enter a uppercase letter");
			characters[i] = reader.next().charAt(0);
			if (characters[i] >= 'A' && characters[i] <= 'Z') {
				count++;
			}
			else if (characters[i] >= 'a' && characters[i] <= 'z') {
				break;
			}
		}
		//Printing out the physical and logical size of the array
		System.out.println("Physical size: "+characters.length+"\nLogical Size: "+count);
	}

}
