package chapter17;

import java.util.*;

public class SlowMap2<K, V> extends AbstractMap<K, V>{
	private List<K> keys = new ArrayList<>();
	private List<V> values = new ArrayList<>();
	
	@Override
	public V put(K key, V value) {
		if(key == null) {
			throw new NullPointerException();
		}
		V oldValue = get(key);
		if(!keys.contains(key)) {
			keys.add(key);
			values.add(value);
		}else {
			values.set(keys.indexOf(key), value);
		}
		return oldValue;
	}

	@Override
	public V get(Object key) {
		if(key == null) {
			throw new NullPointerException();
		}
		if(!keys.contains(key))
			return null;
		return values.get(keys.indexOf(key));
	}
	private EntrySet entrySet = new EntrySet();
	@Override
	public Set<Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return entrySet;
	}
	private class EntrySet extends AbstractSet<Map.Entry<K, V>>{

		@Override
		public Iterator<Entry<K, V>> iterator() {
			// TODO Auto-generated method stub
			return new Iterator<Map.Entry<K,V>>() {
				private int index = -1;
				boolean canRemove;
				@Override
				public boolean hasNext() {
					// TODO Auto-generated method stub
					return index < keys.size() - 1;
				}

				@Override
				public Map.Entry<K, V> next() {
					canRemove = true;
					++index;
					return new MapEntry<K,V>(
							keys.get(index), values.get(index));
				}
				public void remove() {
					if(!canRemove) {
						throw new IllegalStateException();
					}
					canRemove =false;
					keys.remove(index);
					values.remove(index--);
				}
			};
		}
		public boolean contains(Object o) {
			if(o instanceof MapEntry) {
				MapEntry<K,V> e = (MapEntry<K, V>) o;
				K key = e.getKey();
				if(keys.contains(key))
					return e.equals(new MapEntry<K, V>(key, get(key)));
			}
			return false;
		}
		public boolean remove(Object o) {
			if(contains(o)) {
				MapEntry<K,V> e = (MapEntry<K, V>) o;
				K key = e.getKey();
				V val = e.getValue();
				keys.remove(key);
				values.remove(val);
				return true;
			}
			return false;
		}
		@Override
		public int size() {
			// TODO Auto-generated method stub
			return keys.size();
		}
		public void clear() {
			keys.clear();
			values.clear();
		}
		
	}

}
