class Data3 {
	int x;
}

public class ex_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data3 d = new Data3();
		d.x = 10;

		Data3 d2 = copy(d);
		System.out.println("main d.x is " + d.x);
		System.out.println("main d2.x is " + d2.x);		
	}
	
	static Data3 copy(Data3 d) {
		Data3 tmp = new Data3();
		tmp.x = d.x * 20;
		return tmp;
	}

}

