package chapter12;

public class Test5 {

	public static void main(String[] args) {
		Exercise5 e5 = new Exercise5();
		while(true) {
			try {
				
				if(e5.getI() < 5) {
					e5.show();
					e5.add();
					throw e5;
				}
				System.out.println("(((");
				break;
			}catch (Exercise5 e) {
				continue;
			}
		}
	}

}
