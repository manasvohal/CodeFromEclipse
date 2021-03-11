package Input;
import java.util.Scanner;
public class LevelTwoProblemSIX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Level Two Problem Six
		double finalPrice = 0.0d;
		double cost = 0;
		double discount = 0;
		double taxPercentage = 0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the cost, discount, and the tax percetage of the item");
		cost = reader.nextInt();
		reader.nextLine();
		discount = reader.nextInt();
		reader.nextLine();
		taxPercentage = reader.nextInt();
		
		
		finalPrice = cost*(100-discount)/100*(taxPercentage)/100 + (100-discount);
		System.out.printf("Your total price is $%.2f\n",finalPrice);
	}

}
