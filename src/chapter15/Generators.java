package chapter15;

import java.util.*;
import java.util.Collection;

public class Generators {
	public static <T> Collection<T> fill(Collection<T> coll,Generator<T> gen,int n){
		for (int i = 0; i < n; i++) {
			coll.add(gen.next());
		}
		return coll;
	}
	public static <T> List<T> fill(List<T> coll,Generator<T> gen,int n){
		for (int i = 0; i < n; i++) {
			coll.add(gen.next());
		}
		//System.out.println("ddd");
		return coll;
	}
	public static <T> Set<T> fill(Set<T> coll,Generator<T> gen,int n){
		for (int i = 0; i < n; i++) {
			coll.add(gen.next());
		}
		
		return coll;
	}
	public static <T> Queue<T> fill(Queue<T> coll,Generator<T> gen,int n){
		for (int i = 0; i < n; i++) {
			coll.add(gen.next());
		}
		return coll;
	}
	public static <T> LinkedList<T> fill(LinkedList<T> coll,Generator<T> gen,int n){
		for (int i = 0; i < n; i++) {
			coll.add(gen.next());
		}
		return coll;
	}
	public static void main(String[] args) {
		Collection<Coffee> coffee = fill(
				new ArrayList<Coffee>(),new CoffeeGenerator(),4);
		for(Coffee c : coffee) {
			System.out.println(c);
		}
		
		Collection<Integer> fnumbers = fill(
				new ArrayList<Integer>(),new Fibonacci(),4);
		for(Integer c : fnumbers) {
			System.out.println(c);
		}
	}
}
