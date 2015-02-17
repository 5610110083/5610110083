import java.util.ArrayList;

public class ShapeMains{
	public static void main(String args[]){
		ArrayList<Shape> shapes = new ArrayList<Shape>();

		shapes.add(new Rectangular("A", 5.0, 10.0));
		shapes.add(new Circle("B", 3.0));
		shapes.add(new Circle("C", 4.0));
		System.out.println("Biggest = " + findBiggest(shapes).getName() );
	}
	private static double sumArea(ArrayList<shape> shapes){
		double sum = 0.0;
		for
	}
}