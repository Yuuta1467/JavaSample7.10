package test0710;

public class test02 {
	
	public static void main(String [] args) {
		
		int n [] = {1,2,3,4,5,6,7,8,9,10};
		int x = 0;
		int sum = 0;
		
		for(int i = 0; i < n.length; i++) {
			if(n[i] % 2 == 0) {
				x++;
				sum += n[i];
			}
		}
		
		System.out.println("偶数の数" + x);
		System.out.println("偶数の合計" + sum);
		System.out.println();
		
		int n2 = 0;
		int sum2 = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				n2++;
				sum2 += i;
			}
		}
		System.out.println("数"+ n2);
		System.out.println("合計"+ sum2);
	}   

}
