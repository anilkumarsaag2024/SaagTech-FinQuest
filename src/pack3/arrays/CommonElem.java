package pack3.arrays;

public class CommonElem {

	
	public static void main(String[] args) {
		
		
		int a[]= {2, 4, 6, 8,9};
		int b[]= {2, 4,1,7};
		
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					System.out.print("Common elements are :"+a[j]);
					
				}
				System.out.println();
			}
		}
	}
}
