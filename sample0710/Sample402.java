package sample0710;

public class Sample402 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 0; j <= 4; j++) {
				int k = i + j + j;
				System.out.print(i + " + " + j + " + " + j + " = " + k + ", ");
			}System.out.println();
		}
	}

}
