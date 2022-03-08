
public class ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm = new MyMath();
		
		long result1 = mm.add(5, 3);
		long result2 = mm.substract(5, 3);
		long result3 = mm.multiply(5, 3);
		double result4 = mm.divide(5, 3);
		
		System.out.println("add is " + result1);
		System.out.println("substract is " + result2);
		System.out.println("multiply is " + result3);
		System.out.println("divide is " + result4);
	}

}

class MyMath {
	long add(long a, long b) {
		return a + b;
	}

	long substract(long a, long b) {
		return a - b;
	}

	long multiply(long a, long b) {
		return a * b;
	}

	double divide(double a, double b) {
		return a / b;
	}
}