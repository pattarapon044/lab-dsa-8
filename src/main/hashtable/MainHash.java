package main.hashtable;

public class MainHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTable hashTable = new HashTable(5);
		String key1 = "pomme";
		String value1 = "apple";
		String key2 = "pain";
		String value2 = "bread";
		String key3 = "clavier";
		String value3 = "keyboard";

		// put keys and values to hashtable
		hashTable.put(key1, value1);
		hashTable.put(key2, value2);
		hashTable.put(key3, value3);
		System.out.println();

		// show data and size of the hashtable
		hashTable.printHashTable();
		System.out.println("Table size = " + hashTable.getSize());
		System.out.println();

	}

}
