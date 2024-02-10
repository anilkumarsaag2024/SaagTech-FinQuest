package pack4.feb9.core;

public class DuplicateNumbers {
	
	
	
	//Print the Duplciate Numbers
	/**
	 * {1,3,5,7,9}
	 * 
	 * @param args
	 */
	
	/**
	 * Algo 1. Intiate FOR LOOP
	 * INTIATE J Loop
	 * THEN user IF ELSE Condition
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int a[]={1,3,5,7,9,1,3,8};
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if (a[i]==a[j]) {
					
					System.out.print("Print Duplicate are "+a[i]);
					System.out.println();
				}
				
			}
		}
		
		
		
	}

}
