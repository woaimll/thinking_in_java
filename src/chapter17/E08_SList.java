package chapter17;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import static net.mindview.util.Print.*;

public class E08_SList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("Demonstrating SListIterator...");
		SList<String> sl = new SList<String>();
		print(sl);
		SListIterator<String> slit = sl.iterator();
		slit.add("One");
		slit.add("Two");
		slit.add("Three");
		print(slit.hasNext());
		print(sl);
		slit = sl.iterator();
		slit.add("Four");
		for(; slit.hasNext();)
		print(slit.next());
		print(sl);
		slit = sl.iterator();
		print(slit.next());
		slit.remove();
		print(slit.next());
		print(sl);
		// Now, show the same use cases for ListIterator, too
		print("\nDemonstrating ListIterator...");
		List<String> l = new ArrayList<String>();
		print(l);
		ListIterator<String> lit = l.listIterator();
		lit.add("One");
		lit.add("Two");
		lit.add("Three");
		print(lit.hasNext());
		print(l);
		lit = l.listIterator();
		lit.add("Four");
		for(; lit.hasNext();)
		print(lit.next());
		print(l);
		lit = l.listIterator();
		print(lit.next());
		lit.remove();
		print(lit.next());
		print(l);
	}

}
