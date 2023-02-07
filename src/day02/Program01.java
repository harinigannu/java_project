package day02;

public class Program01 {

	public static int fun() {
		// TODO Auto-generated method stub
		int a = 15;
		System.out.println(a*a);
		return a*a;
}
    public static void main(String[] args) {
	long b = fun();
	System.out.println(b+b);
    }
}
//here function solution is 15*15=225
//and long solution is function + function = 225+225 = 240
//because in above program we declared long b is equal to fun();