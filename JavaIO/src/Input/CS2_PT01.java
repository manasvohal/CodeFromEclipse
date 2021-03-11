package Input;
import java.util.Scanner;
public class CS2_PT01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Manas Vohal and Gavin Porter
		
		Scanner reader = new Scanner(System.in);//Declaring the Scanner and Initializing it
		
		System.out.println("Enter your email: "); //Taking input from user
		String email = reader.nextLine(); //Assigning the input to a variable
		System.out.println("Enter your password: "); //Taking input from user
		String password = reader.nextLine(); //Assigning the input to a variable
		System.out.println("Enter your first name:"); //Taking input from user
		String firstName = reader.nextLine(); //Assigning the input to a variable
		System.out.println("Enter your last name:"); //Taking input from user
		String lastName = reader.nextLine(); //Assigning the input to a variable
		System.out.print("Email: " + email + "\r" + "Password: " + password + "\r" + "First Name: " + firstName + "\r" + "Last Name: " + lastName);//Concatenating the string to output all the user inputs in one output by using the escape sequence \r
		System.out.println("\r----------------------------------------------------");
		
		
		System.out.println("Divison Quiz #1");
		System.out.println(firstName + " " + lastName); //Displaying first and last name
		System.out.println(email); //Outputting the email that the user inputed
		System.out.print("\r"); //Using an escape sequence to create a new line
		
		int dividendOne = (int)(Math.random() * ((99-10)+1) + 10); //Using the Math.random to get the max and the min and adding ten to make it a two digit number
		int divisorOne = (int)(Math.random() * ((9-1)+1)) + 1; //Using the Math.random to get the max and the min and adding 1 to make it a 1 digit number
		int quotientAnswerOne = dividendOne/divisorOne;//Storing the quotient into a variable 
		int remainderOne = dividendOne%divisorOne; //Storing the remainder into a variable
		String problemOne = ("1)"+dividendOne+"/"+divisorOne+"= ?"); //Concatenating the string to create the question that is randomly generated
		System.out.println(problemOne);//Outputting the question
		String questionOne = reader.nextLine();//Taking the input from the user and storing it
		System.out.println("Correct Answer: " + quotientAnswerOne+"r"+remainderOne);//Concatenating the string to output the answer using(Quotient + r + remainder) form
		// This section of code is repeated to create 10 random questions so the comments will stay the same
		
		int dividendTwo = (int)(Math.random() * ((99-10)+1) + 10);
		int divisorTwo = (int)(Math.random() * ((9-1)+1)) + 1;
		int quotientAnswerTwo = dividendTwo/divisorTwo; 
		int remainderTwo = dividendTwo%divisorTwo;
		String problemTwo = ("2)"+dividendTwo+"/"+divisorTwo+"= ?");
		System.out.println(problemTwo);
		String questionTwo = reader.nextLine();
		System.out.println("Correct Answer: " + quotientAnswerTwo+"r"+remainderTwo);
		
		int dividendThree = (int)(Math.random() * ((99-10)+1) + 10);
		int divisorThree = (int)(Math.random() * ((9-1)+1)) + 1;
		int quotientAnswerThree = dividendThree/divisorThree; 
		int remainderThree = dividendThree%divisorThree;
		String problemThree = ("3)"+dividendThree+"/"+divisorThree+"= ?");
		System.out.println(problemThree);
		String questionThree = reader.nextLine();
		System.out.println("Correct Answer: " + quotientAnswerThree+"r"+remainderThree);
		
		int dividendFour = (int)(Math.random() * ((99-10)+1) + 10);
		int divisorFour = (int)(Math.random() * ((9-1)+1)) + 1;
		int quotientAnswerFour = dividendFour/divisorFour; 
		int remainderFour = dividendFour%divisorFour;
		String problemFour= ("4)"+dividendFour+"/"+divisorFour+"= ?");
		System.out.println(problemFour);
		String questionFour = reader.nextLine();
		System.out.println("Correct Answer: " + quotientAnswerFour+"r"+remainderFour);
		
		int dividendFive = (int)(Math.random() * ((99-10)+1) + 10);
		int divisorFive = (int)(Math.random() * ((9-1)+1)) + 1;
		int quotientAnswerFive = dividendFive/divisorFive; 
		int remainderFive = dividendFive%divisorFive;
		String problemFive = ("5)"+dividendFive+"/"+divisorFive+"= ?");
		System.out.println(problemFive);
		String questionFive = reader.nextLine();
		System.out.println("Correct Answer: " + quotientAnswerFive+"r"+remainderFive);
		
		int dividendSix = (int)(Math.random() * ((99-10)+1) + 10);
		int divisorSix = (int)(Math.random() * ((9-1)+1)) + 1;
		int quotientAnswerSix= dividendSix/divisorSix; 
		int remainderSix = dividendSix%divisorSix;
		String problemSix = ("6)"+dividendSix+"/"+divisorSix+"= ?");
		System.out.println(problemSix);
		String questionSix = reader.nextLine();
		System.out.println("Correct Answer: " + quotientAnswerSix+"r"+remainderSix);
		
		int dividendSeven = (int)(Math.random() * ((99-10)+1) + 10);
		int divisorSeven = (int)(Math.random() * ((9-1)+1)) + 1;
		int quotientAnswerSeven = dividendSeven/divisorSeven; 
		int remainderSeven = dividendSeven%divisorSeven;
		String problemSeven = ("7)"+dividendSeven+"/"+divisorSeven+"= ?");
		System.out.println(problemSeven);
		String questionSeven = reader.nextLine();
		System.out.println("Correct Answer: " + quotientAnswerSeven+"r"+remainderSeven);
		
		int dividendEight = (int)(Math.random() * ((99-10)+1) + 10);
		int divisorEight = (int)(Math.random() * ((9-1)+1)) + 1;
		int quotientAnswerEight = dividendEight/divisorEight; 
		int remainderEight = dividendEight%divisorEight;
		String problemEight = ("8)"+dividendEight+"/"+divisorTwo+"= ?");
		System.out.println(problemEight);
		String questionEight = reader.nextLine();
		System.out.println("Correct Answer: " + quotientAnswerEight+"r"+remainderEight);
		
		int dividendNine = (int)(Math.random() * ((99-10)+1) + 10);
		int divisorNine = (int)(Math.random() * ((9-1)+1)) + 1;
		int quotientAnswerNine = dividendNine/divisorNine; 
		int remainderNine = dividendNine%divisorNine;
		String problemNine = ("9)"+dividendNine+"/"+divisorNine+"= ?");
		System.out.println(problemNine);
		String questionNine = reader.nextLine();
		System.out.println("Correct Answer: " + quotientAnswerNine+"r"+remainderNine);
		
		int dividendTen= (int)(Math.random() * ((99-10)+1) + 10);
		int divisorTen = (int)(Math.random() * ((9-1)+1)) + 1;
		int quotientAnswerTen = dividendTen/divisorTen; 
		int remainderTen = dividendTen%divisorTen;
		String problemTen = ("10)"+dividendTen+"/"+divisorTen+"= ?");
		System.out.println(problemTen);
		String questionTen = reader.nextLine();
		System.out.println("Correct Answer: " + quotientAnswerTen+"r"+remainderTen);
		
		
		
		
	}

}
