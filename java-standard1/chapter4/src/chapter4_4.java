import java.util.Scanner;

public class chapter4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		char grade = ' '; // 초기화는 공백으로
		
		System.out.println("점수를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		
		System.out.printf("당신의 학점은 %c점 입니다", grade);
	}

}
