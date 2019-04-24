package chapter18;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E17_CharactersInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character, Integer> charsStat = new HashMap<Character, Integer>();
		for (String word : new TextFile("E17_CharactersInfo.java", "\\W+"))
			for (int i = 0; i < word.length(); i++) {
				Character ch = word.charAt(i);
				Integer freq = charsStat.get(ch);
				charsStat.put(ch, freq == null ? 1 : freq + 1);
			}
		List<Character> keys = Arrays.asList(charsStat.keySet().toArray(new Character[0]));
		Collections.sort(keys);
		for (Character key : keys)
			System.out.println(key + " => " + charsStat.get(key));

	}

}
