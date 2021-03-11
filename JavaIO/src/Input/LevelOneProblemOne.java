package Input;
import java.util.Scanner;
public class LevelOneProblemOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Level One Problem One
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a course name: ");
		String userCourse = reader.nextLine();
		reader.nextLine();
		System.out.println("Enter course grade: ");
		double courseGrade = reader.nextDouble();
		System.out.println("Course Name: "+userCourse+" and grade is "+courseGrade);
		
	}

}
