package sample0710;

public class Sample601 {
	
	public static void main(String[] args) {
		
		SampleClass01 s = new SampleClass01();
		int ans = s.add(1, 4);
		String str = s.add("Worid");
		System.out.println(str);
		System.out.println(ans);
		s.showNum();
	}

}
