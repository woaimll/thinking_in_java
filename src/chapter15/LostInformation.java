package chapter15;

import java.util.*;

public class LostInformation {

	public static void main(String[] args) {
		List<Frob> list = new ArrayList<>();
		Map<Frob,Fnorkle> map = new HashMap<>();
		Quark<Fnorkle> quark = new Quark<>();
		Particle<Long, Double> p = new Particle<>();
		System.out.println(Arrays.toString(
				list.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(
				map.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(
				quark.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(
				p.getClass().getTypeParameters()));
		Coffee c = new Coffee();
		System.out.println(Arrays.toString(
				c.getClass().getTypeParameters()));
	}

}
