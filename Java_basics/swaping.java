
// In this code we will see how to swap two numbers without using a third variable

class swaping {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("after swap " + a + " and " + b);

	}
}