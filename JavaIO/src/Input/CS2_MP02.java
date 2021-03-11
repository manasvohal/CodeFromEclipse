package Input;
import java.util.Scanner;
public class CS2_MP02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring and Initializing the Scanner variable
		Scanner reader = new Scanner(System.in);
		
		//Taking input from the user from an integer
		System.out.println("Enter an integer key between 11 and 99");
		//Assigning the input to a variable
		int key = reader.nextInt();
		// dummy line
		reader.nextLine();
		//Taking user input for a five character string
		System.out.println("Enter a five character string");
		//Assigning the user input to a String variable
		String password = reader.nextLine();
		
		//Taking the user inputs first character and using that index to convert it to a character
		char passwordOne = password.charAt(0);
		// Casting the character to an integer to receive the ASCII value
		int passwordIntOne = (int) passwordOne;
		// Doing the hash function to calculate the result
		double calculation = (passwordIntOne*999)/key;
		//Using the Math.pow method to get the final result
		double calculationStepTwo=(Math.pow(calculation,2));
		int finalResult = (int) calculationStepTwo;
		//Using concatenation to convert the final result to a string
		String calculationResult = ""+finalResult;
		//Using both the str.length and the .substring method to find out the last three digits and extracting it from the string
		String finalOne =(calculationResult.substring(calculationResult.length()-3));
		
		//Taking the user inputs first character and using that index to convert it to a character
		char passwordInputTwo = password.charAt(1);
		// Casting the character to an integer to receive the ASCII value
		int passwordIntTwo = (int) passwordInputTwo;
		// Doing the hash function to calculate the result
		double calculationTwo = (passwordIntTwo*999)/key;
		//Using the Math.pow method to get the final result
		double calculationNextStep=(Math.pow(calculationTwo,2));
		int finalResultTwo = (int) calculationNextStep;
		//Using concatenation to convert the final result to a string
		String calculationResultTwo = ""+finalResultTwo;
		//Using both the str.length and the .substring method to find out the last three digits and extracting it from the string
		String finalTwo=(calculationResultTwo.substring(calculationResultTwo.length()-3));
		
		//Taking the user inputs first character and using that index to convert it to a character
		char passwordInputThree = password.charAt(2);
		// Casting the character to an integer to receive the ASCII value
		int passwordIntThree = (int) passwordInputThree;
		// Doing the hash function to calculate the result
		double calculationThree = (passwordIntThree*999)/key;
		//Using the Math.pow method to get the final result
		double calculationStepThree=(Math.pow(calculationThree,2));
		int finalResultThree = (int) calculationStepThree;
		//Using concatenation to convert the final result to a string
		String calculationResultThree = ""+finalResultThree;
		//Using both the str.length and the .substring method to find out the last three digits and extracting it from the string
		String finalThree =(calculationResultThree.substring(calculationResultThree.length()-3));
		
		char passwordInputFour = password.charAt(3);
		// Casting the character to an integer to receive the ASCII value
		int passwordIntFour = (int) passwordInputFour;
		// Doing the hash function to calculate the result
		double calculationFour = (passwordIntFour*999)/key;
		//Using the Math.pow method to get the final result
		double calculationStepFour=(Math.pow(calculationFour,2));
		int finalResultFour = (int) calculationStepFour;
		//Using concatenation to convert the final result to a string
		String calculationResultFour = ""+finalResultFour;
		//Using both the str.length and the .substring method to find out the last three digits and extracting it from the string
		String finalFour =(calculationResultFour.substring(calculationResultFour.length()-3));
		
		char passwordInputFive = password.charAt(4);
		// Casting the character to an integer to receive the ASCII value
		int passwordIntFive = (int) passwordInputFive;
		// Doing the hash function to calculate the result
		double calculationFive = (passwordIntFive*999)/key;
		//Using the Math.pow method to get the final result
		double calculationStepFive=(Math.pow(calculationFive,2));
		int finalResultFive = (int) calculationStepFive;
		//Using concatenation to convert the final result to a string
		String calculationResultFive = ""+finalResultFive;
		//Using both the str.length and the .substring method to find out the last three digits and extracting it from the string
		String finalFive =(calculationResultFive.substring(calculationResultFive.length()-3));
		
		//Concatenating the key to a string to use the string methods
		String encryptedIntegerKey = ""+key;
		//Outputting the final result
		System.out.println("Key: "+ key);
		System.out.println("Password: "+ password);
		System.out.println("-------------------------");
		//Using the .charAt method to extract the two numbers from the key to properly format the Encrypted number
		System.out.println("Encrypted Password: "+encryptedIntegerKey.charAt(0)+finalOne+finalTwo+finalThree+finalFour+finalFive+encryptedIntegerKey.charAt(1));
	}	
	
}
