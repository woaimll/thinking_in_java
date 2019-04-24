package chapter14;

public class Test3 {

	public static void main(String[] args) {
		Rhomboid r = new Rhomboid();
		r.draw();
		Shape s = r;
		s.draw();
		if(s instanceof Circle) {
			Circle c = (Circle) s;
			
			c.draw();
		}
	}

}
