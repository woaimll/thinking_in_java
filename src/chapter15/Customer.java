package chapter15;

public class Customer {
	private static long counter = 1;
	private final long id = counter++;
	private Customer() {}
	public String toString() {
		return "Customer " + id;
	}
	public static Generator<Customer> generator(){
		return new Generator<Customer>() {
			
			@Override
			public Customer next() {
				// TODO Auto-generated method stub
				return new Customer();
			}
		};
	}
}
