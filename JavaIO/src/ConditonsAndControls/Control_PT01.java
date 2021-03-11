package ConditonsAndControls;
import java.util.Scanner;
public class Control_PT01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring a scanner variable for user input
		Scanner reader = new Scanner(System.in);
		//Asking user for a angle
		System.out.println("Enter a angle for a triangle");
		//Assigning the user input to the variable
		int angleOne = reader.nextInt();
		//Asking user for a angle
		System.out.println("Enter a angle for a triangle");
		//Assigning the user input to the variable
		int angleTwo = reader.nextInt();
		//Asking user for a angle
		System.out.println("Enter a angle for a triangle");
		//Assigning the user input to the variable
		int angleThree = reader.nextInt();
		
		//First if condition is checking to see if it is actually a triangle
		if(angleOne + angleTwo + angleThree == 180) {
			if(angleOne == angleTwo && angleTwo == angleThree) { //Since it is a triangle it is checking to see if it equilateral
				//Printing out the user input and the appropriate triangle
				System.out.println("Angles: " + angleOne + " " + angleTwo + " " + angleThree + "\r" + "Equilateral Acute");
			}
			//Checking to see if their is a pair of two angles that allow it to be isosceles
			else if(angleOne == angleTwo || angleTwo == angleThree || angleOne == angleThree) {
				if(angleOne > 90 || angleTwo > 90 || angleThree > 90) { //Checking to see if any angle is obtuse
					//Printing out the user input and the appropriate triangle
					System.out.println("Angles: " + angleOne + " " + angleTwo + " " + angleThree + "\r" + "Isosceles Obtuse");
				}
				else if(angleOne == 90 || angleTwo == 90 || angleThree == 90) { //Checking to see if any angle is a right angle or 90 degrees
					//Printing out the user input and the appropriate triangle
					System.out.println("Angles: " + angleOne + " " + angleTwo + " " + angleThree + "\r" + "Isosceles Right");
				}
				else { //Since the above conditions are not true, it is outputting what the triangle is and in this case it is acute
					//Printing out the user input and the appropriate triangle
					System.out.println("Angles: " + angleOne + " " + angleTwo + " " + angleThree + "\r" + "Isosceles Acute");
				}
			}
			else if(!(angleOne == angleTwo && angleTwo == angleThree)) { //Checking to see if any angle equals each other
				if(angleOne > 90 || angleTwo > 90 || angleThree > 90) { //Checking to see if any angle is obtuse
					//Printing out the user input and the appropriate triangle
					System.out.println("Angles: " + angleOne + " " + angleTwo + " " + angleThree + "\r" + "Scalene Obtuse");
				}
				else if(angleOne == 90 || angleTwo == 90 || angleThree == 90) { //Checking to see if any angle is a right angle or 90 degrees
					//Printing out the user input and the appropriate triangle
					System.out.println("Angles: " + angleOne + " " + angleTwo + " " + angleThree + "\r" + "Scalene Right");
				}
				else { //Since the above conditions are not true, it is outputting what the triangle is and in this case it is acute
					//Printing out the user input and the appropriate triangle
					System.out.println("Angles: " + angleOne + " " + angleTwo + " " + angleThree + "\r" + "Scalene Acute");
				}
			}
		}
		else { // Since the angles do not equal 180 degrees, printing out an error message
			System.out.println("Angles: " + angleOne + " " + angleTwo + " " + angleThree + "\r" + "ERROR");
		}
	}

}
