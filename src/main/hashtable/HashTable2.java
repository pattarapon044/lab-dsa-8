package main.hashtable;

import java.util.Arrays;

public class HashTable2 {
	private int size = 0;
	private String[] keys;
	private String[] values;

	public HashTable2(int capacity) {
		this.keys = new String[capacity];
		this.values = new String[capacity];
	}

	public void put(String key, String value) {
		// is hashtable full?
		if (size == keys.length) {
			System.out.println("Hash table is full!");
		}
		// use hash function to convert key to hash index
		int index = hashFunction(key);
		boolean canAdd = false;
		boolean keyIsCollision = keys[index] != null;
		
		if (keyIsCollision) {
			System.out.println("Putting " + value + " has collision!");
			for (int i = index; i < keys.length; i++) {
				if (keys[i] == null) {
					index = i;
					canAdd = true;
					break;
				}
			}
			if (!canAdd) {
				System.out.println("Putting " + value + "is failed!");
				return;
			}
		}

		// add new value to the array at the computed position
		keys[index] = key;
		values[index] = value;
		size++;
		System.out.println("Putting " + value + " is successful.");
	}

	public int getSize() {
		return size;
	}

	public int hashFunction(String key) {
		int hasIndex = (key.hashCode() & 0x7FFFFFFF) % keys.length;
		return hasIndex;
	}

	public void printHashTable() {
		for (int i = 0; i < keys.length; i++) {
			System.out.println(i + " " + keys[i] + " " + values[i]);
		}
	}

	public String get(String key1) {
		int index = hashFunction(key1);
		boolean found = key1.equals(keys[index]);
		if (found)return values[index];
		
		for (int i = index; i < keys.length; i++) {
			if (keys[i].equals(key1)) {
				return values[i];
			}
		}
		return "N/A";
	}

}
