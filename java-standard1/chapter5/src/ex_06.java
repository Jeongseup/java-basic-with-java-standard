import java.util.Arrays;

public class ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"Kim", "Park", "Yi" };
		
		for ( int i = 0; i < names.length; i++) {
			System.out.println("names["+i+"] : " + names[i]);
		}
		
		names[0] = "Jeongseup";
		
		System.out.println(Arrays.toString(names));
	}

}
