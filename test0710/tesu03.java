package test0710;

public class tesu03 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			if(i < 10) {
				System.out.print(i + ","); 
			}else {
				System.out.println(i);
			}
		}
		for(int i = 1; i <= 10; i++) {
			System.out.print(i);
			if(i < 10) {
				System.out.print(",");
			}
		}
		
	}

}
