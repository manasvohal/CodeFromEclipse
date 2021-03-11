package Input;
import java.util.Scanner;
public class jMSPROBLEM3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number");
		int numOne = reader.nextInt();
		System.out.println("Enter a number");
		int numTwo= reader.nextInt();
		int numOneAndTwoMin = Math.min(numOne,numTwo);
		int numOneAndTwoMax = Math.max(numOne, numTwo);
		System.out.println("The max between the numbers is "+numOneAndTwoMax+ " and the min is "+ numOneAndTwoMin);
		

	}

}
