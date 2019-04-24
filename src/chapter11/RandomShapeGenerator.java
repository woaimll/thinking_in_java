package chapter11;

import java.util.Iterator;
import java.util.Random;

import polymorphism.shape.Circle;
import polymorphism.shape.Shape;
import polymorphism.shape.Square;
import polymorphism.shape.Triangle;

public class RandomShapeGenerator implements Iterable<Shape> {
	private Random rand = new Random(47);
	private final int quantity;

	RandomShapeGenerator(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public Iterator<Shape> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Shape>() {
			private int count;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return count < quantity;
			}

			@Override
			public Shape next() {
				++count;
				return nextShape();
			}
			

			public void remove() { // Not implemented
				throw new UnsupportedOperationException();
			}
		};
	}
	private Shape nextShape() {
		switch(rand.nextInt(3)) {
			default:
			case 0: return new Circle();
			case 1: return new Square();
			case 2: return new Triangle();
		}
	}

}
