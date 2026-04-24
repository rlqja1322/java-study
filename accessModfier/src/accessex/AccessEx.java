package accessex;
	class Sample{
			public int a;
			private int b;//같은 클래스(Sample) 안에서만 접근 가능, 다른 클래스(AccessEx)에서는 접근
			int c; //default 생략됨
	}
	
	public class AccessEx {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
		sample.b = 10;
		sample.c = 10;
		
	}
}
