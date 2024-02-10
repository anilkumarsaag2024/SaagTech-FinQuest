package pack4.feb9.core;

public class RemSpecialCharsInString {

	
	/*
	 * 
	 * The String is "testign n@34"
	 * 
	 * 
	 * 1. Intiate FOR 
	 * 2. 
	 */
	
	//Special chars 
	public static void main(String[] args) {
		
		String str="   testign@$!";
		System.out.println(str.trim());
		int count =0;
		String value="";
		
		for(int i=0;i<str.length();i++) {
			
			if (!Character.isDigit(str.charAt(i) ) 
					
					
					&& !Character.isLetter(str.charAt(i))
							
							&& !Character.isWhitespace(str.charAt(i)))
							
				 {
				
				count++;
				
				
			} else {
				value=value+str.charAt(i);

			}
		}
		
		
		if (count==0) {
			
			System.out.println(" No Special chars found");
			
		} else {
			
			System.out.println("Spec chars found "+count);

		}
		
		
		System.out.println(" The entire String is "+value);
		
	}
}
