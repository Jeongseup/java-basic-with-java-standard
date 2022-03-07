import java.util.Scanner;

public class chapter2_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("두자리 정수를 하나 입력 : ");
		String input = scanner.nextLine();
//		System.out.println(input);
		
		int num = Integer.parseInt(input);
		System.out.printf("num = %d%n", num);
	}

}
