package chapter11;

import net.mindview.util.Generator;

public class MovieNameGenerator implements Generator<String>{
	String[] characters = {
			"Grumpy", "Happy", "Sleepy", "Dopey", "Doc", "Sneezy",
			"Bashful", "Snow White", "Witch Queen", "Prince"
			};
	int next;
	@Override
	public String next() {
		String r = characters[next];
		next = (next + 1) % characters.length;
		return r;
	}

}
