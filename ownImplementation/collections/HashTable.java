package collections;

/**
 * @author Jesus Daniel Villota
 * 
 */
public class HashTable<K,V> implements HashTableInterface<K,V> {
	
	public static final int ARR_SIZE = 127;
	private HNode<K,V>[] nodes;
	
	@SuppressWarnings("unchecked")
	public HashTable() {
		nodes = (HNode<K,V>[]) new HNode[ARR_SIZE];
		for(int i=0; i < ARR_SIZE; i++) {
			nodes[i] = null;
		}
	}
	
	public HNode<K, V>[] getNodes() {
		return nodes;
	}

	private V getValue(K key) {
		if(key == null)
			return null;
	
		int index = key.hashCode() % ARR_SIZE;
		HNode<K,V> items = nodes[index];
	
		if(items == null)
			return null;
		
		while(items!=null) {
			if(items.getKey().equals(key))
				return items.getValue();
			items = items.getNext();
		}
		return null;
	}
	
	public V search (K key) {
		V item = getValue(key);
		if(item == null)
			return null;
		else
			return item;
	}
	
	public void insert(K key, V value) {
		int index = key.hashCode() % ARR_SIZE;
		HNode<K,V> items = nodes[index];
		if(items == null) {
			items = new HNode<>(key,value);
			nodes[index] = items;
		} else {
			while(items!=null) {
				if(items.getKey().equals(key)) {
					items.setValue(value);
					return;
				}
				items = items.getNext();
			}
			items = nodes[index];
			HNode<K,V> item = new HNode<>(key,value);
			item.setNext(items);
			items.setPrevious(item);
			nodes[index] = item;
		}
	}
	
	public void delete(K key) {
		int index = key.hashCode() % ARR_SIZE;
		HNode<K,V> items = nodes[index];
		if(items == null)
			return;
		while(items!=null) {
			if(items.getKey().equals(key)) {
				if(items.getPrevious()!=null) {
					items.getPrevious().setNext(items.getNext());
				}
				if(items.getNext()!=null) {
					items.getNext().setPrevious(items.getPrevious());
				}
				items = items.getNext();
				nodes[index] = items;
				return;
			}
			items = items.getNext();
		}
	}

	@Override
	public boolean contains(K key) {
		int index = key.hashCode() % ARR_SIZE;
		HNode<K,V> items = nodes[index];
		while(items != null) {
			if(items.getKey().equals(key))
				return true;
			items = items.getNext();
		}
		return false;
	}

}
