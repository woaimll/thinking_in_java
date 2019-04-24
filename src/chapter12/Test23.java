package chapter12;

public class Test23 {

	public static void main(String[] args) {
		for (boolean b = false;; b = !b)
			try {
				System.out.println("Constructing...");
				FailingConstructor2 fc = new FailingConstructor2(b);
				try {
					System.out.println("Processing...");
				} finally {
					// We do not have a decent method to call for
					// cleanup!
					System.out.println("Cleanup...");
				}
			} catch (ConstructionException e) {
				System.out.println("Construction has failed: " + e);
				break;
			}
	}

}
