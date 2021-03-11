package Loops;
import java.util.Scanner;
public class DWL2P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a scanner class
		// Taking in the specified date
		// Taking in the amount of days in the month
		// Creating a counting variable for the date and a tab variable for counting as well
		// Creating an if else condition to simulate the the skipping of dates with the use of tabs
		// Using a do while, printing the dates corresponding with the tabs, and if tabs reach its limit of 7, it creates a new line or a new week
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number that specifies a date (1=Sunday) and so on: ");
		int specifiedDate = reader.nextInt();
		System.out.print("Enter the amount of days are in the month: ");
		int amountOfDays = reader.nextInt();
		System.out.println("S\tM\tT\tW\tT\tF\tS");
		int incrementDate = 1;
		int tabsOfDay = 0;
		if(specifiedDate == 2) {
			System.out.print("\t");
			tabsOfDay+=1;
		}
		else if(specifiedDate == 3) {
			System.out.print("\t\t");
			tabsOfDay+=2;
		}
		else if(specifiedDate == 4) {
			System.out.print("\t\t\t");
			tabsOfDay+=3;
		}
		else if(specifiedDate == 5) {
			System.out.print("\t\t\t\t");
			tabsOfDay+=4;
		}
		else if(specifiedDate == 6) {
			System.out.print("\t\t\t\t\t");
			tabsOfDay+=5;
		}
		else if(specifiedDate == 7) {
			System.out.print("\t\t\t\t\t\t");
			tabsOfDay+=6;
		}
		do {
			System.out.print(incrementDate + "\t");
			incrementDate++;
			tabsOfDay++;
			if(tabsOfDay%7 == 0) {
				System.out.println();
			}
		} while(incrementDate <= amountOfDays);
	}

}
