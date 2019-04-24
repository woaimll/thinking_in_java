package chapter13;

import java.util.Scanner;

public class BetterRead {

	public static void main(String[] args) {
		Scanner sc = new Scanner(SimpleRead.input);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println(name);
		System.out.println(
				"How old are you? What is your favorite double?");
		System.out.println("(input: <age> <double>)");
		int age = sc.nextInt();
		double favorite = sc.nextDouble();
		System.out.println(age);
		System.out.println(favorite);
		System.out.format("Hi %s.\n", name);
		System.out.format("In 5 years you will be %d.\n", age + 5);
		System.out.format("My favorite double is %f.",favorite/2);
		//System.out.println(sc.ioException());
	}

}
