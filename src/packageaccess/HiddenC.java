package packageaccess;

import chapter14.A;

public class HiddenC {
	public static A makeA() {
		return new C();
	}
}
