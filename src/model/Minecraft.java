package model;

import java.util.ArrayList;

import collections.HashTable;
import collections.Queue;
import collections.Stack;

public class Minecraft {

	private HashTable<Block, ArrayList<Queue<Block>>> inventory;
	private Queue<Stack<Block>> quickAccessBar;
	
	public Minecraft() {
		this.inventory = new HashTable<Block, ArrayList<Queue<Block>>>();
		this.quickAccessBar = new Queue<Stack<Block>>();
	}

	public HashTable<Block, ArrayList<Queue<Block>>> getInventory() {
		return inventory;
	}

	public void setInventory(HashTable<Block, ArrayList<Queue<Block>>> inventory) {
		this.inventory = inventory;
	}

	public Queue<Stack<Block>> getQuickAccessBar() {
		return quickAccessBar;
	}

	public void setQuickAccessBar(Queue<Stack<Block>> quickAccessBar) {
		this.quickAccessBar = quickAccessBar;
	}
	
	public void addBlockToInventory(Block block) {
		ArrayList<Queue<Block>> actual = inventory.search(block);
		if(actual == null) {
			actual = new ArrayList<>();
			Queue<Block> q = new Queue<>();
			q.offer(block);
			actual.add(q);
			inventory.insert(block, actual);
		} else {
			int last = actual.size()-1;
			if(actual.get(last).getSize() < 64) {
				actual.get(last).offer(block);
			}
		}
	}

	
}
