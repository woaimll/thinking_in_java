package chapter12;

public class LostMessage2 {
	void f() throws VeryImportantException {
		throw new VeryImportantException();
	}

	void dispose() throws HoHumException {
		throw new HoHumException();
	}

	void cleanup() throws YetAnotherException {
		throw new YetAnotherException();
	}
}
