package chapter13;

public class Splitting {
	public static String knights =
			"Then, when you have found the shrubbery, you must"
			+ " cut down the mightiest tree in the forest... "
			+ "with... a herring!";
	public static void split(String regex) {
		System.out.println(knights.split(regex).toString());
	}
	public static void main(String[] args) {
		split(" ");
		split("\\W+");
		split("n\\W+");
	}
}
