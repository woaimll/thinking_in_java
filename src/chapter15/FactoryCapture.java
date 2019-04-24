package chapter15;

import java.util.*;

public class FactoryCapture {
	Map<String,FactoryI<?>> fMap =
			new HashMap<>();
	public Object createNew(String factoryname) {
		FactoryI<?> f = fMap.get(factoryname);
		return f.create();
	}
	public void
	addFactory(String factoryname, FactoryI<?> factory) {
		fMap.put(factoryname, factory);
	}
}
