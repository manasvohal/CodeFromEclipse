package Input;
import java.util.Scanner;
public class javaMathLevel2p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a side length");
		int sideOne = reader.nextInt();
		System.out.println("Enter a side length");
		int sideTwo = reader.nextInt();
		int hypothese = (int) Math.sqrt((int) Math.pow(sideOne,2) + (int) Math.pow(sideTwo, 2));
		System.out.println("The hypothese is: "+ hypothese);
		
	}

}
