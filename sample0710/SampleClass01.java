package sample0710;

public class SampleClass01 {
	
	int n = 1;
	String s = "Hello";
	 
	int add(int a, int b) {
		return a + b;
	}
	String add(String s) {
		return this.s + s;
	}
	void showNum() {
		System.out.println("n = " + n);
	}
	
}
