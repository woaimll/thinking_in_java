package chapter7;

import net.mindview.util.Print;

public class Egg {
	private Yolk y;
	protected class Yolk{
		public Yolk() {
			Print.print("Egg.Yolk()");
		}
	}
	public Egg() {
		System.out.println("New Egg()");
		y = new Yolk();
	}
}
