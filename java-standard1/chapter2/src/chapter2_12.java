
public class chapter2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 14;
		
		System.out.printf("age: %d", age);
		System.out.printf("age: %d%n", age);
		System.out.println("%n test");
		
		String url = "www.naver.com";
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("f1 = %f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2 = %f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3 = %f, %e, %g%n", f3, f3, f3);
		System.out.println();
		
		System.out.printf("d = %f%n", d);
		System.out.printf("d = %014.10f%n", d);
		System.out.println();
		
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);
		System.out.printf("[%.8s]%n", url);
	}

}
