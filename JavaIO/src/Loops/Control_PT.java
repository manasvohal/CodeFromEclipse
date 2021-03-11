package Loops;
import java.util.Scanner;
public class Control_PT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Taking user input from the user using the Scanner class
		Scanner reader = new Scanner(System.in);
		// Asking user for the input
		System.out.println("Input seperated with spaces");
		String input = reader.nextLine();
		
		//Separating the two inputs before the message
		int unEncrypted = input.charAt(0);
		int encrypted = input.charAt(2);
		// Count is the key variable
		int count = 0;
		// Value is the output
		int value = 0;
		// While loop finding key
		while(unEncrypted != encrypted) {
			if(unEncrypted == 90) {
				unEncrypted = 64;
			}
			unEncrypted++;
			count++;
		}
		String message = input.substring(4);
		// For loop printing message
		for(int i = 0; i < message.length(); i++) {
			int key = 0;
			value = message.charAt(i);
			while(key < count) {
				key++;
				value--;
				if(value == 64) {
					value = 90;
				}
			}
			System.out.print((char) value);
		}
		
		
		

	}

}
