package chapter15;

public class Other {
	public static <T extends TwoMethod> void show(T t) {
		t.f();
		t.g();
	}
	public static void main(String[] args) {
		show(new Exercise20());
	}
}
