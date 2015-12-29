package MyMap;

public interface MyMap<K,V> {

	V get(K k);
	void put(K key, V value);
	
}
