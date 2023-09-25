package composite;

public class TestComposite {
	public static void main(String[] args) {
		
		Shape triangle1 = new Triangle();
		Shape triangle2 = new Triangle();
		Shape circle1 = new Circle();
		
		Drawing d = new Drawing();
		d.add(triangle1);
		d.add(triangle2);
		d.add(circle1);
		d.draw("Blue");
		
		d.remove(triangle1);
		
		d.draw("Green");
		d.clear();
	}
}
