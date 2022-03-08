
public class ex_14 {
	static {
		System.out.println("static { }");
	}
	
	{
		System.out.println("{ }");
	}
	
	public ex_14() {
		System.out.println("»ý¼ºÀÚ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ex_14 ex1 = new ex_14()");
		ex_14 ex1 = new ex_14();
		
		System.out.println("ex_14 ex2 = new ex_14()");
		ex_14 ex2 = new ex_14();
		
	}

}
