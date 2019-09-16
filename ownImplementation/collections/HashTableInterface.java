package collections;

public interface HashTableInterface<K,V> {
	V search(K key);
	void insert(K key, V value);
	void delete(K key);
	boolean contains(K key);
	
}
