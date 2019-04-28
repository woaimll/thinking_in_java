package chapter19;

import chapter15.Generator;

public class RandomInputGenerator implements Generator<Input>{

	@Override
	public Input next() {
		// TODO Auto-generated method stub
		return Input.randomSelection();
	}

}
