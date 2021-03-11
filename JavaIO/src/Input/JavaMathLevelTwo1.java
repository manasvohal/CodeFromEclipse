package Input;
import java.util.Scanner;
public class JavaMathLevelTwo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a double number");
		double numOne = reader.nextDouble();
		System.out.println(Math.round(numOne));
	}

}
