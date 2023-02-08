package day3;

public class Program01 {

	public static void main(String[] args) {
		Program01 abc = new Program01();
		addMethod(10,8);
		abc.mulMethod(12,12);
		addMethod(110,200);
		abc.mulMethod(20,6);
		abc.subMethod(90,20);

	}
	public static void addMethod(int x, int b) {
		System.out.println(x+b);
		
	}
	public void subMethod(int x, int b) {
		System.out.println(x-b);
		
	}
	public void mulMethod(int x, int b) {
		System.out.println(x*b);
		
	}
}
//here we did => non static memory allocation by creating a memory space using class name and storing it in object
//in line 6 object => abc and program 01 => class name and () => memory space
//for static no need of using object.method because already memory is allocated for staticX