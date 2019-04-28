package chapter19;

import java.util.Iterator;

import chapter15.Generator;
import net.mindview.util.TextFile;

public class FileInputGenerator implements Generator<Input>{
	private Iterator<String> input;
	public FileInputGenerator(String fileName) {
		input = new TextFile(fileName,";").iterator();
	}
	@Override
	public Input next() {
		if(!input.hasNext())
		      return null;
		    return Enum.valueOf(Input.class, input.next().trim());
	}

}
