package chapter17;

import java.util.*;
import static net.mindview.util.Print.*;

public class ReadOnly {
	static Collection<String> data =
			new ArrayList<>(Countries.names(6));
	public static void main(String[] args) {
		Collection<String> c =
				Collections.unmodifiableCollection(
						new ArrayList<String>(data));
		print(c);
		//c.add("one");
		
		List<String> a = Collections.unmodifiableList(
				new ArrayList<String>(data));
		ListIterator<String> lit = a.listIterator();
		print(lit.next());
		//lit.add("one");
		
		Set<String> s = Collections.unmodifiableSet(
				new HashSet<String>(data));
		print(s);
		s.add("one");
		
		Set<String> ss = Collections.unmodifiableSortedSet(
				new TreeSet<>(data));
		
		Map<String,String> m = Collections.unmodifiableMap(
				new HashMap<String,String>(Countries.capitals(6)));
		print(m);
		//m.put("Ralph", "Howdy!");
		
		Map<String,String> sm =
				Collections.unmodifiableSortedMap(
						new TreeMap<>(Countries.capitals(6)));
	}
}
