package com.sist.collection;
/*
 *
 * 
 */
import java.util.*;

public class Collection_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "java and java jsp html java oracle database jsp jdbc oracle spring";
		Map<String, Integer> count = new HashMap<String, Integer>();
		String[] words = text.split(" ");
		System.out.println(words.length);
		for(String word : words) {
			if(count.containsKey(word)) {
				count.put(word, count.get(word)+1);
			}
			else {
				count.put(word, 1);
			}
		}
		//System.out.println(count);
		for(Map.Entry<String, Integer> e : count.entrySet()) {
			System.out.println(e.getKey() + "의 개수는  " + e.getValue());
		}
	}

}
