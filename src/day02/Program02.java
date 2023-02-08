package day02;

public class Program02 {

	public static void main(String [] args) {
		cal(20,40);
		System.out.println();
		cal(30,10);
	}
	public static void cal(int x, int y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
	}
}

//we can give any name in place of cal and this method is used only for integer of 2 values only and we can use this method N number of times.
//here we used a method in line 5, compiler will search for the cal method, and it will directly assign 20 to x and 40 to y.
//here we used a method in line 6, compiler will search for the cal method, and it will directly assign 10 to x and 30 to y.
//and after assigning it will execute line by line.