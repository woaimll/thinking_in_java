package chapter17;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

public class References {
	private static ReferenceQueue<VeryBig> rq =
			new ReferenceQueue<>();
	public static void checkQueue() {
		Reference<? extends VeryBig> inq = rq.poll();
		if(inq != null) {
			System.out.println("In queue: " + inq.get());
		}
	}
	public static void main(String[] args) {
		int size = 10;
		if(args.length > 0) {
			size = new Integer(args[0]);
		}
		LinkedList<SoftReference<VeryBig>> sa =
				new LinkedList<>();
		for (int i = 0; i < size; i++) {
			sa.add(new SoftReference<VeryBig>(
					new VeryBig("Soft " + i), rq));
			System.out.println("Just created: " + sa.getLast());
			checkQueue();
		}
		LinkedList<WeakReference<VeryBig>> wa =
				new LinkedList<>();
		for (int i = 0; i < size; i++) {
			wa.add(new WeakReference<VeryBig>(
					new VeryBig("Weak " + i), rq));
			System.out.println("Just created: " + wa.getLast());
			checkQueue();
		}
		SoftReference<VeryBig> s =
				new SoftReference<VeryBig>(new VeryBig("Soft"));
		WeakReference<VeryBig> w =
				new WeakReference<VeryBig>(new VeryBig("Weak"));
		System.gc();
		LinkedList<PhantomReference<VeryBig>> pa =
				new LinkedList<>();
		for (int i = 0; i < size; i++) {
			pa.add(new PhantomReference<VeryBig>(
					new VeryBig("Phantom " + i), rq));
			System.out.println("Just created: " + pa.getLast());
			checkQueue();
		}
		
		
	}
	
}
