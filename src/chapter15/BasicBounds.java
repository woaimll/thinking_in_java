package chapter15;

public class BasicBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solid<Bounded> solid =
				new Solid<Bounded>(new Bounded());
		solid.color();
		solid.getY();
		solid.weight();
	}

}
