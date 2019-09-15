/**
 * 
 */
package collections;

/**
 * @author ASUS
 *
 */
public class Node<T> {
	
	private T element;
	
	private Node<T> next;
	
	private Node<T> prior;
	
	public Node(T item) {
		element = item;
		next = null;
		prior = null;
	}
	
	public T getElement() {
		return element;
	}
	
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public Node<T> getPrior() {
		return prior;
	}
	public void setPrior(Node<T> prior) {
		this.prior = prior;
	}
}
