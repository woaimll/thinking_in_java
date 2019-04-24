package chapter17;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.SortedSet;

public class CustomSortedSet<T> implements SortedSet<T> {
	private final List<T> list;

	public CustomSortedSet() {
		list = new LinkedList<T>();
	}

	private CustomSortedSet(List<T> list) {
		this.list = list;
	}

	public String toString() {
		return list.toString();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		checkForNull(o);
		return Collections.binarySearch((List<Comparable<T>>) list, (T) o) >= 0;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return list.iterator();
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return list.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return list.toArray(a);
	}

	@Override
	public boolean add(T o) {
		checkForNull(o);
		int ip = Collections.binarySearch((List<Comparable<T>>) list, (T) o);
		if (ip < 0) {
			ip = -(ip + 1);
			if (ip == list.size()) {
				list.add(o);
			} else {
				list.add(ip, o);
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(Object o) {
		checkForNull(o);
		return list.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		checkForNull(c);
		return list.contains(c);
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		checkForNull(c);
		checkForNullElements(c);
		boolean res = false;
		for (T item : c) {
			res |= add(item);
		}
		return res;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		checkForNull(c);
		return list.retainAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		checkForNull(c);
		return list.removeAll(c);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		list.clear();
	}

	@Override
	public Comparator<? super T> comparator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SortedSet<T> subSet(T fromElement, T toElement) {
		checkForNull(fromElement);
		checkForNull(toElement);
		int fromIndex = list.indexOf(fromElement);
		int toIndex = list.indexOf(toElement);
		checkForValidIndex(fromIndex);
		checkForValidIndex(toIndex);
		try {
			return new CustomSortedSet<T>(list.subList(fromIndex, toIndex));
		} catch (IndexOutOfBoundsException e) {
			throw new IllegalArgumentException(e);
		}
	}

	@Override
	public SortedSet<T> headSet(T toElement) {
		checkForNull(toElement);
		int toIndex = list.indexOf(toElement);
		checkForValidIndex(toIndex);
		try {
			return new CustomSortedSet<T>(list.subList(0, toIndex));
		} catch (IndexOutOfBoundsException e) {
			throw new IllegalArgumentException(e);
		}
	}

	@Override
	public SortedSet<T> tailSet(T fromElement) {
		checkForNull(fromElement);
		int fromIndex = list.indexOf(fromElement);
		checkForValidIndex(fromIndex);
		try {
			return new CustomSortedSet<T>(list.subList(fromIndex, list.size()));
		} catch (IndexOutOfBoundsException e) {
			throw new IllegalArgumentException(e);
		}
	}

	@Override
	public T first() {
		try {
			return list.get(0);
		} catch (IndexOutOfBoundsException e) {
			throw new NoSuchElementException();
		}
	}

	@Override
	public T last() {
		try {
			return list.get(list.size() - 1);
		} catch (IndexOutOfBoundsException e) {
			throw new NoSuchElementException();
		}
	}

	private void checkForNullElements(Collection<?> c) {
		for (Iterator<?> it = c.iterator(); it.hasNext();)
			if (it.next() == null)
				throw new NullPointerException();
	}

	private void checkForNull(Object o) {
		if (o == null)
			throw new NullPointerException();
	}

	private void checkForValidIndex(int idx) {
		if (idx == -1)
			throw new IllegalArgumentException();
	}

	public boolean equals(Object o) {
		return o instanceof CustomSortedSet && list.equals(((CustomSortedSet<?>) o).list);
	}

	public int hashCode() {
		return list.hashCode();
	}

}
