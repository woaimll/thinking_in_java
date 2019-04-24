package chapter15;

import java.util.ArrayList;

//import net.mindview.util.FourTuple;

public class TupleList<A,B,C,D> extends ArrayList<FourTuple<A, B, C, D>>{
	public static void main(String[] args) {
		TupleList<Vehicle, Amphibian, String, Integer> t1 =
				new TupleList<>();
		t1.add(TupleTest.h());
		t1.add(TupleTest.h());
		for(FourTuple<Vehicle, Amphibian, String, Integer> i : t1) {
			System.out.println(i);
		}
	}
}
