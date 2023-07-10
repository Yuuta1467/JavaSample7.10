package test0710;

public class Test01 {
	
	public static void main(String [] args) {
		
		int n [] = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0; i < n.length; i++) {
			if(n[i] % 2 == 0) {
				System.out.print(n[i] + " ");
			}
		}System.out.println();
		
		for(int i = 2; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
	}

}
