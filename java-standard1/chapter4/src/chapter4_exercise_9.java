
public class chapter4_exercise_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		int sum = 0;

//		System.out.println(Math.floorDiv(num, 1000));

		for (double i = 1e10; i > 1; i /= 10) {
//			System.out.println(i);

			int result = Math.floorDiv(num, (int) i);

			if (result == 0) {
				continue;
			} else {
//				System.out.println(result);
				// summation ���ְ�
				sum += result;
				// ���� num �տ� �ĳ���
				num -= result * (int) i;
			}
		}
		// ���������� ���� �� �� ���ָ� �ɵ�?
		sum += num;
		System.out.println(sum);
				
	}

}
