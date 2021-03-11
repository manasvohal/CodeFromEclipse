package JavaArrays;
public class L2P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		// Creating and initializing the array with the test scores
		int[] testScores = {80, 76, 98, 65, 79, 82, 85, 90, 99, 85};
		// Creating a variable that will act as a running sum
		double total = 0;
		// Creating a for loop that checks each index of the array and adds it to the total sum
		for(int i =0 ; i < testScores.length; i++){
			 total = total + testScores[i];
		}
		// Once the for loop is finished, it prints out the average using the total and the length of the array
		System.out.println("The average is " + (total/testScores.length));
		
	}

}
