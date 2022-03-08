
public class ex_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("red", "auto", 4);
		
		System.out.println(c1.color);
		System.out.println(c2.color);
	}

}

class Car {
	String color;
	String gearType;
	int door;

	Car() {
	}

	// constructor overloading
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}