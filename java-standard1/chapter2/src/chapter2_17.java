
public class chapter2_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "3";

		// 숫자를 문자로 변환 - 숫자에 '0'을 더한다.
		// System.out.println('3' - '0');
		System.out.println(str.charAt(0) - '0');

		// 문자를 숫자로 변환
		System.out.println('3' - '0' + 1);
		// System.out.println(3 - 0 + 1);
		System.out.println();

		// 숫자를 문자열로 변환
		System.out.println("3" + 1);
		// 문자를 문자열로 변환
		System.out.println('3' + "2");

		// 이게 이해가 잘 안가는데..
		System.out.println((char) (3 + '0'));
		// 3 은 3이고 '0'를 int로 바꾸면? 48인가봄
		System.out.println(3 + '0');
		System.out.println((short) (3 + '0'));
		// 맞네.. !
		System.out.println((int)('0'));
	}

}
