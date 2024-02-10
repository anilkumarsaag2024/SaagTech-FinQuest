package pack4.feb9.core;

public class LengthOfLastWordString {

	/**
	 * 
	 * THis program is defined to get the last word of the String.
	 * My string is "This is anilkumar"
	 * the Ans is : -Last word Count is: 9
	 * @param args
	 * 
	 * 
	 * Algo : - 
	 */
	
	public static void main(String[] args) {
		
		
		String str="This is anilkumar";
		
		int count =0;
		
		for(int i=str.length()-1;i>=0;i--) {
			
			if (str.charAt(i)==' ') {
				break;
			} else {
				count++;

			}
			
			
		}
		System.out.println("Last word Count is: "+count);
		
	}
}
