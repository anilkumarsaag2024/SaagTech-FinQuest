package pack2.strings;

public class ReverseString {
	
	
	static char reverse;
	
	/**
	 *  The input string is : Anil
	 *  Reverse String is : linA
	 * @param args
	 */
	public static void main(String[] args) {
		
		String name="Anil Kumar";
		
		for(int i=name.length()-1;i>=0;i--) {
			reverse=name.charAt(i);
			System.out.print(reverse);
		}
		
		System.out.println();
		
		
	}

}
