package chapter14;

public class SweetShop {

	public static void main(String[] args) {
		System.out.println("inside main");
		new Candy();
		System.out.println("After creating Candy");
		try {
			Class.forName("chapter14.Gum");
		}catch (ClassNotFoundException e) {
			System.out.println("Couldn't find Gum");
		}
		System.out.println("After Classs.forName(\"Gum\")");
		new Cookie();
		System.out.println("After creating Cookie");
	}

}
