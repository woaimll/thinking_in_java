package chapter12;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*try {
			throw new Exception("main()");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("####");
		}*/
		int[][] a = {{1,2,3},{4,5,6}};
		for(int[] d : a ) {
			System.out.print(d[0]);
			System.out.println();
			System.out.print(d[1]);
			System.out.println();
			System.out.print(d[2]);
		}
	}

}
