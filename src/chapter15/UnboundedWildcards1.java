package chapter15;

import java.util.List;

public class UnboundedWildcards1 {
	static List list1;
	static List<?> list2;
	static List<? extends Object> list3;
	static void assign1(List list) {
		list1 = list;
		list2 = list;
		list = list3;
	}
}
