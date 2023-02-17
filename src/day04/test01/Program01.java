package day04.test01;

public class Program01 {
	public static void addMethod(int a, int b) {
		System.out.println(a+b);
	}
	private static void subMethod(int a, int b) {
		System.out.println(a-b);
	}
	protected static void mulMethod(int a, int b) {
		System.out.println(a*b);
	}
	static void sqrtMethod(int b) {
		System.out.println(b*b);
	}
		public void addMethodNonStatic(int a, int b) {
			System.out.println(a+b);
		}
		private void subMethodNonStatic(int a, int b) {
			System.out.println(a-b);
		}
		protected void mulMethodNonStatic(int a, int b) {
			System.out.println(a*b);
		}
	    void sqrtMethodNonStatic(int b) {
			System.out.println(b*b);
	      }
	      public static void main(String[] args) {
	  		addMethod(20, 20);
	  		mulMethod(20,9);
	  		subMethod(18,10);
	  		sqrtMethod(20);
	  		Program01 x= new Program01();
	  		x.addMethodNonStatic(100, 10);
	  		x.subMethodNonStatic(70, 10);
	  		x.mulMethodNonStatic(90, 60);
	  		x.sqrtMethodNonStatic(100);

	}
}
