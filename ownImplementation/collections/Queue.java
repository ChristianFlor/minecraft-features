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
	
	
	/**
	 *	Create an object of Queue type that can contains elements of T type
	 */
	public Queue() {
		first = null;
		laters = null;
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
	}
	
	public T peek() {
		return first != null ? first.getElement() : null;
	}
	
	public T poll() {
		T temp = null;
		if(first != null) {
			temp = first.getElement();
			first = first.getNext();
			first.setPrior(null);
		}
		return temp;
	}
	
	
	
}
