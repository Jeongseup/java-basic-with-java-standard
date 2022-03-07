
public class ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		System.out.println();
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.printf("c1의 카드종류는 %s이며, 크기는 (%d, %d)%n", c1.kind, c1.width, c1.height);
		System.out.printf("c2의 카드종류는 %s이며, 크기는 (%d, %d)%n", c2.kind, c2.width, c2.height);

		c1.width = 50;
		c1.height = 80;
		
		System.out.printf("c1의 카드종류는 %s이며, 크기는 (%d, %d)%n", c1.kind, c1.width, c1.height);
		// class 변수 수정으로 인해 c2 인스턴스 속성도 변경됨
		System.out.printf("c2의 카드종류는 %s이며, 크기는 (%d, %d)%n", c2.kind, c2.width, c2.height);

	}

}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}
