package chapter17;

import java.util.*;

import chapter15.Generator;

public class MapData<K, V> extends LinkedHashMap<K, V>{
	public MapData(Generator<Pair<K,V>> gen, int quantity) {
		for (int i = 0; i < quantity; i++) {
			Pair<K,V> p = gen.next();
			put(p.key,p.value);
		}
	}
	public MapData(Generator<K> genK, Generator<V> genV, int quantity) {
		for (int i = 0; i < quantity; i++) {
			K k= genK.next();
			V v= genV.next();
			put(k, v);
			System.out.println("genK.next():"+k + "genV.next():"+v);
		}
	}
	public MapData(Generator<K> genK, V value, int quantity) {
		for (int i = 0; i < quantity; i++) {
			put(genK.next(), value);
		}
	}
	public MapData(Iterable<K> genK, Generator<V> genV) {
		for(K key : genK) {
			put(key, genV.next());
		}
	}
	public MapData(Iterable<K> genK, V value) {
		for(K key : genK) {
			put(key, value);
		}
	}
	public static <K,V> MapData<K,V> map(Generator<Pair<K,V>> gen, int quantity){
		return new MapData<>(gen, quantity);
	}
	public static <K,V> MapData<K,V> map(Generator<K> genK, Generator<V> genV, int quantity){
		return new MapData<>(genK, genV, quantity);
	}
	public static <K,V> MapData<K,V> map(Generator<K> genK, V value, int quantity){
		return new MapData<>(genK, value, quantity);
	}
	public static <K,V> MapData<K,V> map(Iterable<K> genK, Generator<V> genV){
		return new MapData<>(genK, genV);
	}
	public static <K,V> MapData<K,V> map(Iterable<K> genK, V value){
		return new MapData<>(genK, value);
	}
}
