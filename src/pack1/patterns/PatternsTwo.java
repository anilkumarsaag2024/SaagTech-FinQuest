package pack1.patterns;

public class PatternsTwo {
	
	
	/*
	 * 1
	 * 1 2 3 
	 * 1 2 3 4 5 
	 * 1 2 3 4 5 6 7 
	 */
	
	
	
	public static void main(String[] args) {
		
		int data =1;
		
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=data;j++) {
				System.out.print(j+ "  ");
			}
			System.out.println();
			data =data+2;
			
		}
	}

}
