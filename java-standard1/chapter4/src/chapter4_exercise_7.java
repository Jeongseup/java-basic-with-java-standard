
public class chapter4_exercise_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str = "12345";
			int sum = 0;
			
			for (int i = 0; i < str.length(); i++) {
				System.out.println(str.charAt(i));
//				System.out.println((int)(str.charAt(i)));
				
				String tempChar = str.charAt(i) + ""; 
				int tempNumber = Integer.parseInt(tempChar);
//				System.out.println(tempNumber);
				sum += tempNumber;
						
			}
			System.out.println("Sum is " + sum);
	}

}
