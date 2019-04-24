package chapter17;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SimpleHashMap5<K, V> extends AbstractMap<K, V> {
	static class Entry<K, V> implements Map.Entry<K, V> {
		private K key;
		private V value;
		Entry<K, V> next;

		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public K getKey() {
			// TODO Auto-generated method stub
			return key;
		}

		@Override
		public V getValue() {
			// TODO Auto-generated method stub
			return value;
		}

		@Override
		public V setValue(V v) {
			V result = value;
			value = v;
			return result;
		}

		public int hashCode() {
			return key.hashCode() ^ (value == null ? 0 : value.hashCode());
		}

		public boolean equals(Object o) {
			if (o instanceof Entry) {
				Entry<K, V> e = (Entry<K, V>) o;
				Object key1 = getKey();
				Object key2 = e.getKey();
				if (key1.equals(key2)) {
					Object val1 = getValue();
					Object val2 = e.getValue();
					return val1 == null ? val2 == null : val1.equals(val2);

				}

			}
			return false;
		}

		public String toString() {
			return key + "=" + value;
		}

	}

	static final int SIZE = 997;
	Entry<K, V>[] buckets = new Entry[SIZE];

	public V put(K key, V value) {
		V oldValue = null;
		Entry<K, V> newPair = new Entry(key, value);
		int index = Math.abs(key.hashCode()) % SIZE;
		if (buckets[index] == null) {
			buckets[index] = newPair;
		}
		Entry<K, V> prevPair = null;
		boolean found = false;
		for (Entry<K, V> pair = buckets[index]; pair != null; pair = pair.next) {
			if (pair.getKey().equals(key)) {
				oldValue = pair.getValue();
				if (prevPair != null) {
					prevPair.next = newPair;
				} else {
					buckets[index] = newPair;
				}
				newPair.next = newPair;
				found = true;
				break;
			}
			prevPair = pair;
		}
		if (!found) {
			prevPair.next = newPair;
		}
		return oldValue;
	}

	public V get(Object key) {
		int index = Math.abs(key.hashCode());
		for (Entry<K, V> pair = buckets[index]; pair != null; pair = pair.next) {
			if (pair.getKey().equals(key)) {
				return pair.getValue();
			}
		}
		return null;
	}

	@Override
	public Set<Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K, V>> set = new HashSet<>();
		for (Entry<K, V> bucket : buckets) {
			for (Entry<K, V> pair = bucket; pair != null; pair = pair.next) {
				set.add(pair);
			}
		}
		return set;
	}

	public void clear() {
		buckets = new Entry[SIZE];
	}

	public V remove(Object key) {
		int index = Math.abs(key.hashCode()) % SIZE;
		Entry<K, V> prevPair = null; // Previous element
		for (Entry<K, V> pair = buckets[index]; pair != null; pair = pair.next) {
			if (pair.getKey().equals(key)) {
				V value = pair.getValue();
				if (prevPair != null)
					prevPair.next = pair.next;
				else
					buckets[index] = null;
				return value;
			}
		}
		return null;
	}

	public int size() {
		// Could rely on the inherited implementation, which
		// returns entrySet().size(), but this is faster:
		int sz = 0;
		for (Entry<K, V> bucket : buckets)
			for (Entry<K, V> pair = bucket; pair != null; pair = pair.next)
				sz++;
		return sz;
	}

	public boolean isEmpty() {
		// Could just say return size() == 0;
		// but this is faster:
		for (Entry<K, V> bucket : buckets)
			if (bucket != null)
				return false;
		return true;
	}

	public boolean containsKey(Object key) {
		// A slight modification of the previous method:
		for (Entry<K, V> bucket : buckets) {
			for (Entry<K, V> pair = bucket; pair != null; pair = pair.next)
				if (pair.getKey().equals(key))
					return true;
		}
		return false;
	}
}
