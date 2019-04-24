package chapter17;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class SimpleHashSet<K> extends AbstractSet<K> {
	private final static int SIZE = 997;
	@SuppressWarnings("unchecked")
	private LinkedList<K>[] buckets = new LinkedList[SIZE];
	public boolean add(K key) {
		int index = Math.abs(key.hashCode()) % SIZE;
		if(buckets[index] == null) {
			buckets[index] = new LinkedList<>();
		}
		LinkedList<K> bucket = buckets[index];
		ListIterator<K> it = bucket.listIterator();
		while(it.hasNext()) {
			if(it.next().equals(key)) {
				return false;
			}
		}
		it.add(key);
		return true;
	}
	public boolean contains(Object key) {
		int index = Math.abs(key.hashCode()) % SIZE;
		if(buckets[index] == null)
			return false;
		Iterator<K> it = buckets[index].iterator();
		while(it.hasNext()) {
			if(it.next().equals(key)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public Iterator<K> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<K>() {
			private int count;
			private boolean canRemove;
			private int index1, index2;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return count < size();
			}

			@Override
			public K next() {
				if(hasNext()) {
					canRemove = true;
					++count;
					for(;;) {
						while(buckets[index1] == null) {
							++index1;
							try {
								return buckets[index1].get(index2++);
							}catch (IndexOutOfBoundsException e) {
								++index1;
								index2 = 0;
							}
						}
					}
				}
				throw new NoSuchElementException();
			}
		};
	}

	@Override
	public int size() {
		int sz = 0;
		for(LinkedList<K> bucket : buckets) {
			if(bucket != null) {
				sz += bucket.size();
			}
		}
		return sz;
	}

}
