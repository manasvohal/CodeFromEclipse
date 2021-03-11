package BasicMethods;
import java.util.Scanner;
public class level2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		// Asking the user to pick an operator and based on that print the corresponding method
		Scanner reader = new Scanner(System.in);
		System.out.println("What operator do you want to use");
		String operator = reader.nextLine();
		if(operator.equals("+")) {
			add();
		}
		else if(operator.equals("-")) {
			subtract();
		}
		else if(operator.equals("*")) {
			multiply();
		}
		else if(operator.equals("/")) {
			divide();
		}
		else if(operator.equals("%")) {
			modulus();
		}
	}
	// Methods with the corresponding operators
	public static void add() {
		System.out.println(4+2);
	}
	public static void subtract() {
		System.out.println(4-2);
	}
	public static void divide() {
		System.out.println(4/2);
	}
	public static void multiply() {
		System.out.println(4*2);
	}		
	public static void modulus() {
		System.out.println(4%2);
	}		


}
