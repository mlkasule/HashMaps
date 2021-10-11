/*
 *  Hashmpas are used to store and access data by just a key access.
 */

import java.util.HashMap;

public class HashingLab {

	public static void main(String[] args) {

		String[] keys = { "a", "b", "c", "d", "e", "f", "g", "h", "j", "k" };
		int[] elements = { 27, 53, 13, 10, 138, 109, 49, 174, 26, 24, };

		// Instantiate the HashMaps
		HashMap<String, Integer> myData = new HashMap<String, Integer>();

		// add values to hashmap
		for (int i = 0; i < 10; i++) {
			myData.put(keys[i], elements[i]);
		}

		// print the hasmpa
		System.out.println(myData);

		// print only keys
		System.out.println("Keys are: " + myData.keySet());

		// print only values
		System.out.println("Values are: " + myData.values());

	}

}
