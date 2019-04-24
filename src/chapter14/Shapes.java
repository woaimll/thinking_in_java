package chapter14;

import java.util.*;

public class Shapes {

	public static void main(String[] args) {
		List<Shape> list = Arrays.asList(
				new Circle(),new Square(),new Triangle());
		for(Shape shape : list) {
			shape.draw();
		}
	}

}
