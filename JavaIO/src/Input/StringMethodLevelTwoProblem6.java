package Input;
import java.util.Scanner;
public class StringMethodLevelTwoProblem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring the Scanner to take userInput
		Scanner reader = new Scanner(System.in);
		//Asking the to be user to input the numbers that want raised
		System.out.println("Enter an equation that you want to raise to a power:");	
		//Assigning the user input to the String variable
		String userInput = reader.nextLine();
		
		String firstNumber = "";
		String secondNumber = "";
		
		int indexOfCarrot = userInput.indexOf("^");
		//Extracting the first number before the carrot(Index 0 to the carrot) and then parsing it to make it an integer
		int firstNumberInt = Integer.parseInt(userInput.substring(0,indexOfCarrot));
		//Extracting the last number after the carrot  (carrot to the next index) and then parsing it to make an integer
		int secondNumberInt = Integer.parseInt(userInput.substring(indexOfCarrot+1));
		// Declaring it as a double and using the Math Method of power to use the first number and raising it by the second number
		double finalAnswer = Math.pow(firstNumberInt, secondNumberInt);
		//Outputting the final answer of the result of Math.pow
		System.out.println("Final answer is " + finalAnswer);
		
	}

}
