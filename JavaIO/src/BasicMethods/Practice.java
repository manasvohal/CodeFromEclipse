package BasicMethods;
import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login();
	}
	public static void login() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a username");
		String username = reader.nextLine();
		System.out.println("Enter a password");
		String password = reader.nextLine();
		if((username.equals("aladdin")) && (password.equals("opensesame"))) {
			System.out.println("User Approved");
		}
		else {
			System.out.println("Denied");
		}
		
	}

}
