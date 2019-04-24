package chapter18;

import java.io.Serializable;

public class Animal implements Serializable{
	private String name;
	private House preferredHouse;
	Animal(String nm, House h){
		name = nm;
		preferredHouse = h;
	}
	public String toString() {
		return name + "[" + super.toString() +
	"], " + preferredHouse + "\n";
	}
}
