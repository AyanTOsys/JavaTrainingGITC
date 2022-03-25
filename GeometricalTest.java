
public class GeometricalTest {

	public static void main(String[] args) {
		GeometryShapes gs;
		
		gs = new Square(1.5f);
		gs.draw();
		gs.calcArea();
		
		gs = new Rectangle(1.5f, 2.5f);
		gs.draw();
		gs.calcArea();

	}

}

abstract class GeometryShapes{
	abstract void draw();
	abstract void calcArea();
}

class Square extends GeometryShapes{
	float side;

	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	void draw() {
		System.out.println("Drawing squares..");
		
	}

	@Override
	void calcArea() {
		float area = side * side;
		System.out.println("Area of square "+area);
	}
	
}
class Rectangle extends Square{
	
	float side2;

	public Rectangle(float side, float side2) {
		super(side);
		this.side2 = side2;
	}

	@Override
	void draw() {
		System.out.println("Drawing rectangles..");
		
	}

	@Override
	void calcArea() {
		float area = side * side2;
		System.out.println("Area of rectangle "+area);
	}
	
}