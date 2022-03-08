
public class ex_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyMath3 mm = new MyMath3();
		
		System.out.println("mm.add is " + mm.add(3, 3));
		
		System.out.println("mm.add is " + mm.add(3L, 3L));
	}

}

class MyMath3 {
	int add(int a, int b) {
		System.out.println("int add");
		return a + b;
	}

	long add(long a, long b) {
		System.out.println("long add");
		return a + b;
	}
}