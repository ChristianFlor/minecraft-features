/**
 * 
 */
package collections;

/**
 * @author Natalia Gonzalez
 *
 */
public class Queue<T> implements QueueInterface<T> {
	
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
	@Override
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
		System.out.println("Queue of type: " + object.toString() +", size = " + size);
	}
	@Override
	public T peek() {
		return first != null ? first.getElement() : null;
	}
	
	@Override
	public T poll() {
		T temp = null;
		if(first != null) {
			temp = first.getElement();
			first = first.getNext();
			first.setPrior(null);
			size--;
		}
		return temp;
	}
	
	public int getSize() {
		return size;
	}
	
	@Override
	public String toString() {
		Node<T> temp = first;
		String s = "";
		while(temp != null) {
			s += temp.toString() + "-";
			temp = temp.getNext();
		}
		return s;
	}
	
}
