package BasicMethods;
import java.util.Scanner;
public class parametersL3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a password");
		String password = reader.nextLine();
		ruleOne(password);
		ruleTwo(password);
		ruleThree(password);
		
	}
	public static void ruleOne(String password) {
		boolean ruleOne = false;
		if(password.length() >= 6) {
			ruleOne = true;
			System.out.println(ruleOne);
		}
		else {
			System.out.println(ruleOne);
		}
			
	}
	public static void ruleTwo(String password) {
		boolean ruleTwo = false;
		if(password.indexOf("1") != -1) {
			ruleTwo = true;
			System.out.println(ruleTwo);
		}
		else {
			System.out.println(ruleTwo);
		}
	}
	public static void ruleThree(String password) {
		boolean ruleThree = false;
		if(password.indexOf("P") == 0) {
			ruleThree = true;
			System.out.println(ruleThree);
		}
		else {
			System.out.println(ruleThree);
		}
	}

}
