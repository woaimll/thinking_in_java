package chapter14;

import java.util.Arrays;
import java.util.List;

public class Test5 {
	static void rotateAll(List<RShape> shapes) {
		for (RShape shape : shapes) {
			if (!(shape instanceof RCircle)) {
				shape.rotate(45);
			}
		}
	}

	public static void main(String[] args) {
		List<RShape> shapes = Arrays.asList(new RCircle(), new RSquare(), new RTriangle());
		rotateAll(shapes);
	}
}
