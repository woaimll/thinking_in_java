package chapter12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Exercise6_1 extends Exception{
	private Logger logger =
			Logger.getLogger("Exercise6_1");
	public Exercise6_1() {
		StringWriter sw = new StringWriter();
		printStackTrace(new PrintWriter(sw));
		logger.severe(sw.toString());
	}
}
