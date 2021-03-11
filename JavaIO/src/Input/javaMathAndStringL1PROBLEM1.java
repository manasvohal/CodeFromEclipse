package Input;
import java.util.Scanner;
public class javaMathAndStringL1PROBLEM1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Problem One
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a double number");
		double num = reader.nextDouble();
		num = Math.abs(num);
		System.out.println(num);
	}

}
