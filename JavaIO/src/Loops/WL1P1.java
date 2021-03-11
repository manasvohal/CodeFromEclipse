package Loops;
import java.util.Scanner;
public class WL1P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number between 10 and 20");
		int num = reader.nextInt();
		int count = 1;
		while(count <= num) {
			System.out.println("Java");
			count++;
		}
	}

}
