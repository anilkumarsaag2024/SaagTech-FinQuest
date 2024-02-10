package pack4.feb9.core;

import java.util.HashMap;

public class EachCharOccurances {
	
	//saag -->s -1 a - 2, g -1
	
	/**
	 * 1. Create object of hashMap
	 * 2. store Sring in CharArray();
	 * 3. Intiate FOR, Then Use IF ELSE
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		String name="saag";
		
		HashMap<Character, Integer> hashMap=new HashMap<Character, Integer>();
		
		char[] c=name.toCharArray();
		
		for(char data :c) {
			
			if(hashMap.containsKey(data)) {
				hashMap.put(data, hashMap.get(data)+1);
			}
			else {
				hashMap.put(data, 1);
			}
		}
		System.out.println(name+" : "+hashMap);
	}		
		
	

}
