package sample0710;

public class Sample505 {
	
	public static void main(String[] args) {
		int a[][] = {{0,1},{2,5,5},{3,4,5,6,7,},{2,1,2,5,7,8,8,0}};
		int m,n;
		
		for(m = 0; m < a.length; m++) {
			for(n = 0; n < a[m].length; n++) {
				System.out.print(a[m][n] + " ");
			}
			System.out.println();
		}
				
	}

}
