package BasicMethods;

public class pl2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10,5);
		subtract(10,5);
		multiply(10,5);
		divide(10,5);
		modulus(10,5);
	}
	public static void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	public static void subtract(int num1, int num2) {
		System.out.println(num1-num2);
	}
	public static void multiply(int num1, int num2) {
		System.out.println(num1*num2);
	}
	public static void divide(int num1, int num2) {
		System.out.println(num1/num2);
	}
	public static void modulus(int num1, int num2) {
		System.out.println(num1%num2);
	}

}
