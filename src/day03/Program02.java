package day03;

public class Program02 extends Program01 {

	public static void main(String[] args) {
		Program01 abc = new Program01();
		abc.addMethod(10, 5);
		mulMethod(5,5);
		subMethod(45,8);
	}
}

//we are using inheritance concept here, Program01 is parent class(superclass) and program02 is child class(subclass).
//we connected two classes like public class Program02 extends Program01. // extends is a keyword