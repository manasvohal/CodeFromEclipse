package JavaArrays;
import java.util.Scanner;
public class L1P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		String[] names = new String[5];
		for(int i = 0; i < 5;  i++) {
			System.out.println("Enter a name");
			names[i] = reader.nextLine();
		}
		
		for(int x = 0; x < 5; x++) {
			System.out.println("Names are " + names[x]);
		}
		
			
	}
}

