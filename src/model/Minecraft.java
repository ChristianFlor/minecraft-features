package model;

import java.util.ArrayList;

import collections.HashTable;
import collections.Queue;
import collections.Stack;

public class Minecraft {

	public static final String STONE = "Stone";
	public static final String GRASS = "Grass";
	public static final String DIRT = "Dirt";
	public static final String COBBLESTONE = "Cobblestone";
	public static final String WATER = "Water";
	public static final String BROWN_MUSHROOM = "Brown_Mushroom";
	public static final String RED_MUSHROOM = "Red_Mushroom";
	public static final String OBSIDIAN = "Obsidian";
	public static final String FIRE = "Fire";
	public static final String SNOW = "SNOW";
	public static final String ICE = "ICE";
	public static final String CACTUS = "CACTUS";
	public static final String REEDS = "Reeds";
	public static final String VINE = "Vine";
	public static final String MYCELIUM = "Mycelium";
	
	private HashTable<String, ArrayList<Queue<Block>>> inventory;
	private Queue<Stack<Block>> quickAccessBar;
	
	public Minecraft() {
		this.inventory = new HashTable<String, ArrayList<Queue<Block>>>();
		this.quickAccessBar = new Queue<Stack<Block>>();
	}

	public HashTable<String, ArrayList<Queue<Block>>> getInventory() {
		return inventory;
	}

	public void setInventory(HashTable<String, ArrayList<Queue<Block>>> inventory) {
		this.inventory = inventory;
	}

	public Queue<Stack<Block>> getQuickAccessBar() {
		return quickAccessBar;
	}

	public void setQuickAccessBar(Queue<Stack<Block>> quickAccessBar) {
		this.quickAccessBar = quickAccessBar;
	}
	
	public void addBlockToInventory(String type) {
		Block block = new Block(type);
		ArrayList<Queue<Block>> actual = inventory.search(type);
		if(actual == null) {
			actual = new ArrayList<Queue<Block>>();
			Queue<Block> q = new Queue<>();
			q.offer(block);
			actual.add(q);
			inventory.insert(type, actual);
		} else {
			int last = actual.size()-1;
			if(actual.isEmpty()) {
				Queue<Block> q = new Queue<>();
				q.offer(block);
				actual.add(q);
			}
			else {			
				if(actual.get(last).getSize() < 64) {
					actual.get(last).offer(block);
				} else {
					Queue<Block> q = new Queue<>();
					q.offer(block);
					actual.add(q);
				}
			}
		}
	}

	
}
