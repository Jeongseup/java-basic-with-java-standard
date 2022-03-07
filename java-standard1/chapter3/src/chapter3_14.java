
public class chapter3_14 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("str1 == \"abc\" ? %b%n", str1 == "abc");
		System.out.printf("str2 == \"abc\" ? %b%n", str2 == "abc"); // 서로 다른 객체..?
		
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
	}
}
