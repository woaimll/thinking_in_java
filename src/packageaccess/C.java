package packageaccess;

import chapter14.A;

class C implements A{

	@Override
	public void f() {
		System.out.println("public C.f()");
	}
	public void g() {
		System.out.println("public C.g()");
	}
	void u() {
		System.out.println("protected C.u()");
	}
	protected void v() {
		System.out.println("protected C.v()");
	}
	private void w() {
		System.out.println("private C.w()");
	}

}
