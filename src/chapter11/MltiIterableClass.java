package chapter11;

import java.util.*;

public class MltiIterableClass extends IterableClass{
	public Iterable<String> reversed(){
		return new Iterable<String>() {
			
			@Override
			public Iterator<String> iterator() {
				// TODO Auto-generated method stub
				return new Iterator<String>() {
					int current = words.length - 1;
					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return current > -1;
					}

					@Override
					public String next() {
						// TODO Auto-generated method stub
						return words[current--];
					}
				};
			}
		};
	}
	public Iterable<String> randomized(){
		return new Iterable<String>() {
			
			@Override
			public Iterator<String> iterator() {
				List<String> shuffled = 
						new ArrayList<String>(Arrays.asList(words));
				Collections.shuffle(shuffled,new Random(47));		
				return shuffled.iterator();
			}
		};
	}
	public static void main(String[] args) {
		MltiIterableClass mic = new MltiIterableClass();
		for(String s : mic.reversed())
			System.out.print(s + " ");
		System.out.println();
		for(String s : mic.randomized())
			System.out.print(s + " ");
		System.out.println();
		for(String s : mic)
			System.out.print(s + " ");
	}
}
