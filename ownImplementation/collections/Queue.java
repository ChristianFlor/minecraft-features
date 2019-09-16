/**
 * 
 */
package collections;

/**
 * @author Natalia Gonzalez
 *
 */
public class Queue<T>{
	
	/**
	 *	represents the first element in the stack
	 */
	private Node<T> first;
	/**
	 *	represents the first element in the stack
	 */
	private Node<T> laters;
	
	private int size;
	
	
	/**
	 *	Creates an object of Queue type that can contains elements of T type
	 */
	public Queue() {
		first = null;
		laters = null;
		size = 0;
	}

	public void offer(T object) {
		if(first==null) {
			first = new Node<T>(object);
			laters = first;
		}else {
			laters.setNext(new Node<T>(object));
			laters.getNext().setPrior(laters);
			laters = laters.getNext();
		}
		size++;
	}

	public T peek() {
		return first != null ? first.getElement() : null;
	}
	
	public T poll() {
		T temp = null;
		if(first != null) {
			temp = first.getElement();
			first = first.getNext();
			if(first!= null) {
				first.setPrior(null);
			}
			size--;
		}
		return temp;
	}
	
	public int getSize() {
		return size;
	}
	
}
