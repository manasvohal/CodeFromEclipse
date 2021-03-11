package Loops;
import java.util.Scanner;
public class WL1P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int count = 1;
		int sum = 0;
		while (count <= 9) {
			System.out.println("Enter a number");
			int num = reader.nextInt();
			sum += num;
			count++;
		}
		System.out.println(sum);
	}

}
