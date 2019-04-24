package chapter18;
import static net.mindview.util.Print.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Blips {
	public static void main(String[] args) throws IOException, Exception {
		print("Constructing objects:");
		Blip1 b1 = new Blip1();
		Blip2 b2 = new Blip2();
		ObjectOutputStream o = new ObjectOutputStream(
				new FileOutputStream("Blips.out"));
		print("Saving objects:");
		o.writeObject(b1);
		o.writeObject(b2);
		o.close();
		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("Blips.out"));
		print("Recovering b1:");
		b1 = (Blip1) in.readObject();
		print("Recovering b2:");
		b2 = (Blip2) in.readObject();
	}
}
