class MyMath2 {
	long a, b;

	long add() {
		return a + b;
	}

	long substract() {
		return a - b;
	}

	long multiply() {
		return a * b;
	}

	double divide() {
		return a / b;
	}

	static long add(long a, long b) {
		return a + b;
	}

	static long substract(long a, long b) {
		return a - b;
	}

	static long multiply(long a, long b) {
		return a * b;
	}

	static double divide(double a, double b) {
		return a / b;
	}
}

public class ex_09 {
	public static void main(String arsgs[]) {
		System.out.println(MyMath2.add(200, 100));
		
		MyMath2 mm = new MyMath2();
		
		mm.a = 200L;
		mm.b = 200L;
		
		System.out.println(mm.add());
	}
}
