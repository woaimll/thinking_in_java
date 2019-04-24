package chapter16;

import java.util.Comparator;

public class CompTypeComparator implements Comparator<CompType>{

	@Override
	public int compare(CompType o1, CompType o2) {
		// TODO Auto-generated method stub
		return (o1.j < o2.j ? -1 : (o1.j == o2.j ? 0 : 1));
	}
	
}
