package chapter12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class NullException{
	private static Logger logger = 
			Logger.getLogger("NullException");
	public static void printLogger(Exception e) {
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		logger.severe(sw.toString());
	}
}
