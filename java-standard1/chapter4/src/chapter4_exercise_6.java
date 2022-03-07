
public class chapter4_exercise_6 {
	public static void main(String[] args) {

		/*
		 * 문제 4 - 6 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
		 */

		// 두 주사위 모두 눈이 1부터 6까지 있는 주사위 인 경우라고 가정
		
		// 첫 번째 주사위 loop
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
