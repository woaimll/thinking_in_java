package chapter17;

public class E18_SlowSet {

	public static void main(String[] args) {
		SlowSet<String> slowSet = new SlowSet<String>();
		slowSet.addAll(Countries.names(10));
		slowSet.addAll(Countries.names(10));
		slowSet.addAll(Countries.names(10));
		System.out.println(slowSet);
	}

}
