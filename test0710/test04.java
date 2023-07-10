package test0710;

public class test04 {

	public static void main(String[] args) {

		int n[] = new int[20];
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			if (i != 0) {
				sum += 5;
			}
			System.out.print(sum + " ");
			if (i <= 10 && sum % 2 == 0) {
				System.out.print(",");
			} else if (i > 10 && 19 >= i && sum % 2 == 1) {
				System.out.print(",");

			}
		}
		System.out.println();
		System.out.println();
		
		
		int n2[] = new int[20];

		for (int i = 0; i < n2.length; i++) {
			n2[i] = i*5;
			System.out.print(" " + n2[i]);
			if(i <= 10 && n2[i] % 2 == 1) {
				System.out.print(",");
			}else if(i >= 11 && i <= 19 && n2[i] % 2 == 0) {
				System.out.print(",");
			}
		}
	}

}
