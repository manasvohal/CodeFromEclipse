package JavaArrays;
import java.util.Scanner;
public class L1P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		Double[] testScores = new Double[6];
		for(int i = 0; i < 6;  i++) {
			System.out.println("Enter a test score");
			testScores[i] = reader.nextDouble();
		}
		
		for(int x = 0; x < 6; x++) {
			System.out.println("Test Scores are " + testScores[x]);
		}
	}

}
