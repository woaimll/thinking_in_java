package chapter12;

public class MyException2 extends Exception{
	private int x;

	public MyException2() {
	}

	public MyException2(String msg) {
		super(msg);
	}
	
	public MyException2(String msg,int x) {
		super(msg);
		this.x = x;
	}
	
	public int val() {
		return x;
	}
	public String getMessage() {
		return "Detail Message:" + x + " " + super.getMessage();
	}
	
}
