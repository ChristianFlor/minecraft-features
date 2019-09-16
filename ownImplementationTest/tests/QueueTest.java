/**
 * 
 */
package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import collections.Queue;

/**
 * @author ASUS
 *
 */
class QueueTest {
	
	private Queue<String> queue;

	void setUpScenary1() {
		queue = new Queue();
	}
	
	void setUpScenary2() {
		queue = new Queue();
		queue.offer("Angela");
	}
	
	void setUpScenary3() {
		queue = new Queue();
		queue.offer("Andrea");
		queue.offer("Maria");
		queue.offer("Miguel");
	}
	/*
	String searchLatest() {
		String laters = null;
		while(queue.)
	}*/
	
	@Test
	void queue1() {
		setUpScenary1();
		String first = queue.peek();
		assertTrue(first == null);
	}
	
	@Test
	void offer1() {
		setUpScenary1();
		String element = "Ana Maria";
		queue.offer(element);
		assertTrue(queue.peek().equals(element));
	}
	
	@Test
	void offer2() {
		setUpScenary2();
		String element = "Ana Maria";
		queue.offer(element);
		assertTrue(queue.peek().equals("Angela"));
	}
	
	@Test
	void poll1() {
		setUpScenary1();
		String first = queue.poll();
		assertTrue(first == null);
	}
	
	@Test
	void poll2() {
		setUpScenary2();
		String first = queue.poll();
		assertTrue(first.equals("Angela"));
		first = queue.peek();
		assertTrue(first == null);
	}
	
	@Test
	void poll3() {
		setUpScenary3();
		String first = queue.poll();
		assertTrue(first.equals("Andrea"));
		first = queue.peek();
		assertTrue(first.equals("Maria"));
	}
	
	@Test
	void peek1() {
		setUpScenary1();
		String first = queue.peek();
		assertTrue(first == null);
	}
	
	@Test
	void peek2() {
		setUpScenary2();
		String first = queue.peek();
		assertTrue(first.equals("Angela"));
	}
}
