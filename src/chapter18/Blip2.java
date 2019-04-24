package chapter18;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import static net.mindview.util.Print.*;

public class Blip2 implements Externalizable{
	Blip2(){
		print("Blip2 Constructor");
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		print("Blip2.writeExternal");
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		print("Blip2.readExternal");
	}

}
