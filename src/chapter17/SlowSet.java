package chapter17;

import java.util.*;

public class SlowSet<K> extends AbstractSet<K> {
	private List<K> keys = new ArrayList<>();
	public boolean add(K key) {
		if(!contains(key)) {
			keys.add(key);
			return true;
		}
		return false;
	}
	@Override
	public Iterator<K> iterator() {
		// TODO Auto-generated method stub
		return keys.iterator();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return keys.size();
	}

}
