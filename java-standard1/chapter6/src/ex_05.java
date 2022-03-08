
public class ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		d.x = 10;
		
		System.out.println("main d.x is " + d.x);
		change(d);
		
		System.out.println("main d.x is " + d.x);		
	}
	
	static void change(Data d) {
		d.x  = 1000;
		System.out.println("change d.x is " + d.x);
	}

}

class Data {
	int x;
}