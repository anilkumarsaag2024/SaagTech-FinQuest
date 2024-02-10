package pack4.feb9.core;

public class DuplicateNums {
	
	public static void main(String[] args) {
		
		
		
		int a[]={1,3,5,7,9,1,3,8,7,9};
		
		//need to print duplicates 1,3 
		
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					System.out.print("Duplicates are :"+a[j]);
				}
				System.out.println();
			}
		}
	}

}
