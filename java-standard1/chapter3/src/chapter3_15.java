import java.util.Scanner;

public class chapter3_15 {
	public static void main(String[] arsgs) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';

		System.out.println("���� �ϳ� �Է�");

		String input = scanner.nextLine();
		ch = input.charAt(0);

		if ('0' <= ch && ch <= '9') {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
		}

		if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.println("�Է��Ͻ� ���ڴ� �������Դϴ�.");
		}
	}
}
