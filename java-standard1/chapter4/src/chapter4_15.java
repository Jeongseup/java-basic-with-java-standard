import java.util.Scanner;

public class chapter4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input =0, answer = 0;
		
		answer = (int) (Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1 ~ 100 ���� �� �Է� : ");
			input = scanner.nextInt();
			
			if (input > answer) {
				System.out.println("�� ���� ��");
			} else if (input < answer) {
				System.out.println(" �� ū ��");
			}
		} while (input != answer);
			
		
		
		System.out.println("����");
	}

}
