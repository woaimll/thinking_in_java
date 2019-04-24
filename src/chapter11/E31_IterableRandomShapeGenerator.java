package chapter11;

import polymorphism.shape.Shape;

public class E31_IterableRandomShapeGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomShapeGenerator rsg = new RandomShapeGenerator(10);
		for(Shape shape : rsg) {
			System.out.println(shape.getClass().getSimpleName());
		}
	
	}

}
