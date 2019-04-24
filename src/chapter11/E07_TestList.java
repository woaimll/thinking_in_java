package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E07_TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDClass[] idc = new IDClass[10];
		for (int i = 0; i < idc.length; i++) {
			idc[i] = new IDClass();
		}
		List<IDClass> lst = new ArrayList<IDClass>(Arrays.asList(idc));
		System.out.println("lst = " + lst);
		List<IDClass> subSet = 
				lst.subList(lst.size()/4, lst.size()/2);
		System.out.println("subSet = " + subSet);
		subSet.clear();
		subSet.add(new IDClass());
		System.out.println("lst= " + lst);
		
		
	}

}
