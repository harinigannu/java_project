package day06;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter value of a:- " );
		int a=x.nextInt();
		System.out.println("Enter value of b:- " );
		int b=x.nextInt();
		System.out.println("Enter value of c:- " );
		double c=x.nextDouble();
		x.close();
	
		System.out.println(a+b);
		System.out.println(a+c);
		System.out.println(b+c);
		
		System.out.println("");
		
		System.out.println(a-b);
		System.out.println(a-c);
		System.out.println(b-c);
		
		System.out.println("");
		
		System.out.println(a*b);
		System.out.println(a*c);
		System.out.println(b*c);
		
		System.out.println("");
		
		System.out.println(a/b);
		System.out.println(a/c);
		System.out.println(b/c);
		
		System.out.println("");
		
		System.out.println(a%b);
		System.out.println(a%c);
		System.out.println(b%c);


	}

}

//we used scanner for user input, input is given by user.
//we should use close method at last
//the above are arithematic operations + - * / %
