package chapter17;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class SimpleHashMap2<K, V> extends SimpleHashMap<K, V> {
	@Override
	public V put(K key, V value) {
		V oldValue = null;
		int index = Math.abs(key.hashCode()) % SIZE;
		MapEntry<K, V> pair = new MapEntry<K, V>(key, value);
		if (buckets[index] == null)
			buckets[index] = new LinkedList<MapEntry<K, V>>();
		// Lines added here:
		else {
			System.out.println("Collision while adding\n" + pair + "\nBucket already contains:");
			Iterator<MapEntry<K, V>> it = buckets[index].iterator();
			while (it.hasNext())
				System.out.println(it.next());
		}
		// End of lines added
		LinkedList<MapEntry<K, V>> bucket = buckets[index];
		boolean found = false;
		ListIterator<MapEntry<K, V>> it = bucket.listIterator();
		while (it.hasNext()) {
			MapEntry<K, V> iPair = it.next();
			if (iPair.getKey().equals(key)) {
				oldValue = iPair.getValue();
				it.set(pair); // Replace old with new
				found = true;
				break;
			}
		}
		if (!found)
			buckets[index].add(pair);
		return oldValue;
	}
}
