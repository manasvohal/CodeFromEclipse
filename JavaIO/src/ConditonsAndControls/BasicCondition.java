package ConditonsAndControls;
import java.util.Scanner;
public class BasicCondition {
	public static void caculatorFunction(int numOne, int numTwo, String operator) {
		
		if(operator.equals("+")){
			System.out.println("Output is " + (numOne + numTwo));
		}
		else if(operator.equals("-")) {
			System.out.println("Output is " + (numOne-numTwo));
		}
		else if(operator.equals("*")) {
			System.out.println("Output is " + (numOne*numTwo));
		}
		else if(operator.equals("/")) {
			System.out.println("Output is " + (numOne/numTwo));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number");
		int numOneInput = reader.nextInt();
		System.out.println("Enter a number");
		int numTwoInput = reader.nextInt();
		reader.nextLine();
		System.out.println("Enter an operator");
		String operatorInput = reader.nextLine();
		caculatorFunction(numOneInput,numTwoInput,operatorInput);
	}

}
