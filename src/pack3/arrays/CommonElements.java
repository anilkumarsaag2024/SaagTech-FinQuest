package pack3.arrays;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {
	
	
	
	
	
	/*
	 * 
	 * 
	 * {2, 4, 6, 8,9}
	 * 
	 * {2, 4,1,7}
	 * 
	 * Print Common Elements : 2, 4
	 */
	public static void main(String[] args) {
	
		
		int a[]= {2, 4, 6, 8,9};
		int b[]= {2, 4,1,7};
		
		
		Set<Integer> data=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			data.add(a[i]);
			
		}
		
		for(int i=0;i<b.length;i++) {
			
			if(data.contains(b[i])) {
				System.out.println(b[i]);
				
			}
			
		}
		
		
	}

}
