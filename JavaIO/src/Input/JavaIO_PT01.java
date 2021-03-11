package Input;
import java.util.Scanner;
public class JavaIO_PT01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Manas Vohal and Gavin Porter
		
		//Declaring the Scanner variable to take user input for the binary digits
		Scanner reader = new Scanner(System.in);
		//Asking the user input for the byte or the 8 binary digit numbers
		System.out.println("Enter a byte or in othe terms enter 8 binary digits with leading zeros");
		
		//Assigning the user input to a string variable
		String binaryNumber = reader.nextLine();
		//Parsing the string to an integer by the use of Integer.parseInt with the inclusion int radix to symbolize what the user is parsing which in this case is binary or base 2
		int decimalNumber = Integer.parseInt(binaryNumber,2);
		
		//Finding the ASCII variable by casting the decimal that found and converting it to a char to symbolize the ASCII variable
		char asciiOutput =  (char) decimalNumber;
		
		//Outputting the ASCII value based on what the user inputed as the binary number and using the escape sequence \t to enter a tab in the output
		System.out.println("Input: " + binaryNumber + "\t" + "Output: " + asciiOutput);
	}

}
