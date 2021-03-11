package ConditonsAndControls;
import java.util.Scanner;
public class JavaCodeInAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		*Declaring scanner variable to take in user input
		*Asking users to enter a class grade
		*Averaging that class grade by 5
		*Using conditions to check if student got distinguished, honor roll or nothing
		*/
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a class grade");
		double gradeOne = reader.nextDouble();
		System.out.println("Enter a class grade");
		double gradeTwo = reader.nextDouble();
		System.out.println("Enter a class grade");
		double gradeThree = reader.nextDouble();
		System.out.println("Enter a class grade");
		double gradeFour= reader.nextDouble();
		System.out.println("Enter a class grade");
		double gradeFive = reader.nextDouble();
		double average = (gradeOne + gradeTwo + gradeThree + gradeFour + gradeFive)/5;
		
		if(average >= 95 && gradeOne >= 90 && gradeTwo >= 90 && gradeThree >= 90 && gradeFour >= 90 && gradeFive >= 90) {
			System.out.println("You got Distingushed Honors with an average of " + average);
		}
		else if(average < 95 && average > 90) {
			System.out.println("You did not get Distingushed Honors but you got Honor Roll with an average of");
		}
		else if(!(average < 95 && average > 90)) {
			System.out.println("Your average was "+ average);
		}
		
	}
}
