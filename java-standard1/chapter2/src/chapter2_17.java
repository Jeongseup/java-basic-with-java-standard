
public class chapter2_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "3";

		// ���ڸ� ���ڷ� ��ȯ - ���ڿ� '0'�� ���Ѵ�.
		// System.out.println('3' - '0');
		System.out.println(str.charAt(0) - '0');

		// ���ڸ� ���ڷ� ��ȯ
		System.out.println('3' - '0' + 1);
		// System.out.println(3 - 0 + 1);
		System.out.println();

		// ���ڸ� ���ڿ��� ��ȯ
		System.out.println("3" + 1);
		// ���ڸ� ���ڿ��� ��ȯ
		System.out.println('3' + "2");

		// �̰� ���ذ� �� �Ȱ��µ�..
		System.out.println((char) (3 + '0'));
		// 3 �� 3�̰� '0'�� int�� �ٲٸ�? 48�ΰ���
		System.out.println(3 + '0');
		System.out.println((short) (3 + '0'));
		// �³�.. !
		System.out.println((int)('0'));
	}

}
