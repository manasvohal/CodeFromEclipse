import java.util.*;
public class subSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner reader = new Scanner(System.in);
//		System.out.print("Enter 1st set: ");
//		String firstSet = reader.nextLine();
//		String[] arr1 = firstSet.split(",");
//		System.out.print("Enter 2nd set: ");
//		String secondSet = reader.nextLine();
//		String[] arr2 = secondSet.split(",");
		String arr10[] = {"APPLE","GRAPE","PEAR","ORANGE","GRAPEFRUIT"};
		String arr20[] = {"ORANGE", "GRAPE","BANANA"};
		
        if (check(arr10, arr20)) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
  
	}
	public static boolean check(String arr1[], String arr2[]) {
		int i = 0;
        int j = 0;
        for (i = 0; i < arr2.length; i++) {
            for (j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j])
                    break;
            }
            if (j == arr2.length) {
                return false;
            }
        }
        return true;
	}

}
