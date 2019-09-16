package tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import collections.Queue;
import collections.Stack;

/**
 * 
 */

/**
 * @author 
 *
 */
class StackTest {
	
	private Stack<String> stack;

	void setUpScenary1() {
		stack = new Stack();
	}
	
	void setUpScenary2() {
		stack = new Stack();
		stack.push("Angela");
	}
	
	void setUpScenary3() {
		stack = new Stack();
		stack.push("Andrea");
		stack.push("Maria");
		stack.push("Miguel");
	}
	
	@Test
	void stack1() {
		setUpScenary1();
		String first = stack.peek();
		assertTrue(first == null);
	}
	
	@Test
	void push1() {
		setUpScenary1();
		String element = "Ana Maria";
		stack.push(element);
		assertTrue(stack.peek().equals(element));
	}
	
	@Test
	void push2() {
		setUpScenary2();
		String element = "Ana Maria";
		stack.push(element);
		assertTrue(stack.peek().equals(element));
	}
	
	@Test
	void pop1() {
		setUpScenary1();
		String first = stack.pop();
		assertTrue(first == null);
	}
	
	@Test
	void pop2() {
		setUpScenary2();
		String first = stack.pop();
		assertTrue(first.equals("Angela"));
		first = stack.peek();
		assertTrue(first == null);
	}
	
	@Test
	void poll3() {
		setUpScenary3();
		String first = stack.pop();
		assertTrue(first.equals("Miguel"));
		first = stack.peek();
		assertTrue(first.equals("Maria"));
	}
	
	@Test
	void peek1() {
		setUpScenary1();
		String first = stack.peek();
		assertTrue(first == null);
	}
	
	@Test
	void peek2() {
		setUpScenary2();
		String first = stack.peek();
		assertTrue(first.equals("Angela"));
	}
	
	@Test
	void emmpty1() {
		setUpScenary1();
		boolean value = stack.empty();
		assertTrue(value);
	}
	
	@Test
	void emmpty2() {
		setUpScenary2();
		boolean value = stack.empty();
		assertFalse(value);
	}

}
