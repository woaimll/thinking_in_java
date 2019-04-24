package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import fact.Factory;

public class Part {
	public String toString() {
		return getClass().getSimpleName();
	}
	static List<Factory<? extends Part>> partFactories =
			new ArrayList<>();
	static {
		partFactories.add(new FuelFilter.Factory());
		partFactories.add(new AirFilter.Factory());
		partFactories.add(new CanbinAirFilter.Factory());
		partFactories.add(new OilFilter.Factory());
		partFactories.add(new FanBelt.Factory());
		partFactories.add(new PowerSteeringBelt.Factory());
		partFactories.add(new GeneratorBelt.Factory());
	}
	private static Random rand = new Random(47);
	public static Part creatRandom() {
		int n = rand.nextInt(partFactories.size());
		return partFactories.get(n).create();
	}
}
