package Loops;
import java.util.Scanner;
public class DWL2P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a scanner class to take in user input
		// creating a grade, total and count variable
		// Using a do while to allow the user to enter grade
		// Verifying if the grade is valid and then if it is valid, add it to the total and add to the count as a proper number
		// After user enters -999, average the numbers and print it out
		Scanner reader = new Scanner(System.in);
		int grade = 0;
		int count = 0;
		int runningTotal = 0;
		do {
			System.out.print("Enter a grade: ");
			grade = reader.nextInt();
			if(grade < 0 || grade > 100) {
				System.out.println("Invalid");
			}
			else {
				runningTotal+=grade;
				count++;
			}
		}while (grade != 999);
		System.out.println("The average is " + (runningTotal/count));
	}

}
