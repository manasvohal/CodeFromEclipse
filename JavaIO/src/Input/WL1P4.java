package Input;
import java.util.Scanner;
public class WL1P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Do you wish to countinue, Enter no to countinue");
		String answer = reader.nextLine();
		while(!(answer.equals("no"))){
			System.out.println("Do you wish to countinue, Enter no to countinue");
			answer = reader.nextLine();
		}
		
	}

}
