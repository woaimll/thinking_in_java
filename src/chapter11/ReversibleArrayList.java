package chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ReversibleArrayList<T> extends ArrayList<T> {

	public ReversibleArrayList(Collection<? extends T> c) {
		super(c);
	}
	@SuppressWarnings("unchecked")
	public Iterable<T> reversed(){
		
		return new Iterable(){
			public Iterator<T> iterator(){
				return new Iterator<T>() {
					int current = size() - 1;
					public boolean hasNext() {
						return current > -1;
					}
					public T next() {
						return get(current--);
					}
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
}
