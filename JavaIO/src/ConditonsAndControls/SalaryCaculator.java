package ConditonsAndControls;
import java.util.Scanner;
public class SalaryCaculator {
	public static double salaryCaculator(double moneyPerHour, double hoursWorked, double vacationDays) {
		
		double weeklyPayCheck = moneyPerHour * hoursWorked;
		double unpaidTime = vacationDays * moneyPerHour * 8;
		return (weeklyPayCheck * 52) - unpaidTime;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("How much money do you make an hour");
		double moneyInput = reader.nextDouble();
		System.out.println("Enter how many hours do you work a week");
		double hoursInput = reader.nextDouble();
		System.out.println("Enter how many days you have off on vacation");
		double vacationInput = reader.nextDouble();
		double result = salaryCaculator(moneyInput,hoursInput,vacationInput);
		System.out.println(result);
	}

}
