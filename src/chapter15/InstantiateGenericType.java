package chapter15;

public class InstantiateGenericType {

	public static void main(String[] args) {
		ClassAsFactory<Employee> fe =
				new ClassAsFactory<>(Employee.class);
		System.out.println("ClassAsFactory<Employee> success");
		try {
			ClassAsFactory<Integer> fi =
					new ClassAsFactory<>(Integer.class);
		}catch (Exception e) {
			System.out.println("failed");
		}
	}

}
