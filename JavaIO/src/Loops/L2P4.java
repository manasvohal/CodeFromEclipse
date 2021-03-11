package Loops;

public class L2P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// The first for loop is that for every line created, the stars are increasing by 10
		// The second for loop is that every time a new line of stars is created, it creates a line until the stars reach 100
		// Then it prints the star and a creates a new line
		for(int i=10; i<=100; i+=10) {
			for(int j=1; j<=i; j++) {
				System.out.print("* "); 
            }
			System.out.println();
		}
	}

}
