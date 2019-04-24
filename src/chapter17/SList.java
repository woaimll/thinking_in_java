package chapter17;

import java.util.NoSuchElementException;

public class SList<T> {
	private static class Link<T> {
		T element;
		Link<T> next;

		Link(T element, Link<T> next) {
			this.element = element;
			this.next = next;
		}
	}

	private final Link<T> header = new Link<T>(null, null);

	SList() {
		header.next = header;
	}

	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append("[");
		for(SListIterator<T> it = iterator();it.hasNext();) {
			T element = it.next();
			buf.append(element == this ? "(this SList)" :
			String.valueOf(element));
			if(it.hasNext())
			buf.append(", ");
		}
		buf.append("]");
		return buf.toString();
	}

	public SListIterator<T> iterator() {
		return new SListIteratorImpl();
	}

	private class SListIteratorImpl implements SListIterator<T> {
		private Link<T> lastReturned = header;
		private Link<T> next;

		public SListIteratorImpl() {
			next = header.next;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return next != header;
		}

		@Override
		public T next() {
			if (next == header)
				throw new NoSuchElementException();
			lastReturned = next;
			next = next.next;
			return lastReturned.element;
		}

		@Override
		public void remove() {
			if (lastReturned == header)
				throw new IllegalStateException();
			// Find an element before the last returned one
			for (Link<T> curr = header;; curr = curr.next)
				if (curr.next == lastReturned) {
					curr.next = lastReturned.next;
					break;
				}
			lastReturned = header;
		}

		@Override
		public void add(T element) {
			lastReturned = header;
			Link<T> newLink = new Link<T>(element, next);
			if (header.next == header) // Empty list
				header.next = newLink;
			else {
				// Find an element before the one pointed by 'next'
				for (Link<T> curr = header;; curr = curr.next)
					if (curr.next == next) {
						curr.next = newLink;
						break;
					}
			}
		}

	}

}
