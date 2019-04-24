package chapter19;

public class Burrito {
	Spiciness degree;
	public Burrito(Spiciness degree) {
		this.degree = degree;
	}
	public String toString() {
		return "Burrito is " + degree;
	}
	public static void main(String[] args) {
		System.out.println(new Burrito(Spiciness.NOT));
		System.out.println(new Burrito(Spiciness.MEDIUM));
		System.out.println(new Burrito(Spiciness.HOT));
	}
}
