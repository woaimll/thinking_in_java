package chapter18;

import java.io.File;

import net.mindview.util.PPrint;
import static net.mindview.util.Print.*;

public class DirectoryDemo {
	public static void main(String[] args) {
		PPrint.pprint(Directory.walk(".").dirs);
		
		for(File file : Directory.local(".", "T.*"))
			print(file);
		print("----------------------");
		for(File file : Directory.walk(".", "T.*\\.java"))
			print(file);
		for(File file : Directory.walk(".", ".*[Zz].*\\.class"))
			print(file);
	}
}
