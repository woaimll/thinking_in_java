package chapter18;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import static net.mindview.util.Print.*;

public class Blip1 implements Externalizable{
	public Blip1() {
		print("Blip1 Constructor");
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		print("Blip1.writeExternal");
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		print("Blip1.readExternal");
		
	}

}
