package Input;
import java.util.Scanner;
public class JavaMathLevelTwop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number for x1");
		int x1 = reader.nextInt();
		System.out.println("Enter a number for x2");
		int x2 = reader.nextInt();
		System.out.println("Enter a number for y1");
		int y1 = reader.nextInt();
		System.out.println("Enter a number for y2");
		int y2 = reader.nextInt();
		System.out.println("The slope is: " + (y2-y1)+"/"+(x2-x1));
	}

}
