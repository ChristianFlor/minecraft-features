/**
 * 
 */
package collections;

/**
 * @author Natalia Gonzalez
 * 	The Stack Class allows stacking objects of particular type T
 */
public class Stack<T> {
	
	/**
	 *	Represents the first element in the stack
	 */
	private Node<T> first;
	
	/**
	 *	Create an object of Stack type that can contains elements of T type
	 */
	public Stack() {
		first = null;
	}
	
	/**
	 *	Add an item to the stack
	 *	@param obejct is an object of T type
	 */
	public void push(T object) {
		if(first == null) {
			first = new Node<T>(object);
		}else {
			first.setPrior(new Node<T>(object));
			first.getPrior().setNext(first);
			first = first.getPrior();
			
		}
	}
	
	/**
	 *	
	 */
	public T peek() {
		return first.getElement();
	}
	
	public T pop() {
		T temp = null;
		if(first != null) {
			temp = first.getElement();
			first = first.getNext();
			first.setPrior(null);
		}
		return temp;
	}
	
	
	
}
