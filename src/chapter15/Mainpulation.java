package chapter15;

public class Mainpulation {
	public static void main(String[] args) {
		HasF hf = new HasF();
		Mainpulator<HasF> mainpulator =
				new Mainpulator<HasF>(hf);
		mainpulator.mainpulate();
	}
}
