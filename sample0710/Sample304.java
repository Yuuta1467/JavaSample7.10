package sample0710;

public class Sample304 {
	
	public static void main(String[] args) {
		
		int dice = (int)(Math.random()*7)+1;
		System.out.println("サイコロの目は" + dice + "です。");
		
		if(1 <= dice && dice <= 6) {
			if(dice % 2 == 0) {
				System.out.println("丁");
			}else{
				System.out.println("半");
			}
		}else {
			System.out.println("範囲外");
		}
		
	}
}
