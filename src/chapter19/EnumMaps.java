package chapter19;

import java.util.EnumMap;
import java.util.Map;

import static net.mindview.util.Print.*;
import static chapter19.AlarmPoints.*;

public class EnumMaps {
	public static void main(String[] args) {
		EnumMap<AlarmPoints, Command> em =
				new EnumMap<>(AlarmPoints.class);
		em.put(KITCHEN, new Command() {
			
			@Override
			public void action() {
				print("Kitchen fire!");
			}
		});
		em.put(BATHROOM, new Command() {
			
			@Override
			public void action() {
				print("Bathroom alert!");
			}
		});
		for(Map.Entry<AlarmPoints, Command> e : em.entrySet()) {
			printnb(e.getKey() + ": ");
			e.getValue().action();
		}
		try {
			em.get(UTILITY).action();
		}catch (Exception e) {
			print(e);
		}
	}
}
