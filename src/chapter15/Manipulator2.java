package chapter15;

public class Manipulator2<T extends HasF> {
	private T obj;
	public Manipulator2(T x){
		obj = x;
	}
	public void mainpulate() {
		obj.f();
	}
}
