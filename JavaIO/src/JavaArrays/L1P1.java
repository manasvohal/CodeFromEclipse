package JavaArrays;

public class L1P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] courses = new String[7];
		
		courses[0] = "Algebra 2";
		courses[1] = "English 10";
		courses[2] = "Honors Chem";
		courses[3] = "CS2";
		courses[4] = "APUSH";
		courses[5] = "Spanish III";
		courses[6] = "Entrepreneurship";
		for(int i = 0; i < courses.length; i++) {
			System.out.println(courses[i]);
		}
	}

}
