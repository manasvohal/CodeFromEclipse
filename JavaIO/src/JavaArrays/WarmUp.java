package JavaArrays;
import java.util.Scanner;
public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int[] scores = new int[5];
		double total = 0;
		for(int i = 0; i < scores.length; i++) {
			System.out.println("Enter a test score");
			scores[i] = reader.nextInt();
			total += scores[i];
		}
		System.out.println("The average is: " + (total/scores.length));
	}

}
