
public class chapter4_exercise_6 {
	public static void main(String[] args) {

		/*
		 * ���� 4 - 6 �� ���� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */

		// �� �ֻ��� ��� ���� 1���� 6���� �ִ� �ֻ��� �� ����� ����
		
		// ù ��° �ֻ��� loop
		for (int i = 1; i < 7; i++) {
//			System.out.println(i);
			for (int j = 1; j < 7; j ++) {
				if (i + j == 6) {
					System.out.printf("Find! when \"i\" is %d and \"j\" is %d%n", i, j);
				}
			}
		}
	}
}
