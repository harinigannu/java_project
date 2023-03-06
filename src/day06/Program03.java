package day06;

import java.util.Scanner;

public class Program03 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter value of a:- ");
		int a = x.nextInt();
		System.out.println("Enter value of b:- " );
		int b=x.nextInt();
		System.out.println("Enter value of c:- " );
		float c=x.nextFloat();
		x.close();
		
		System.out.println(a>b);
		System.out.println(b>a);
		System.out.println(c>b);
		System.out.println(b>c);
		System.out.println(c>a);
		System.out.println(a>c);
		
		System.out.println("");
		
		System.out.println(a<b);
		System.out.println(b<a);
		System.out.println(c<b);
		System.out.println(b<c);
		System.out.println(c<a);
		System.out.println(a<c);
		
		System.out.println("");
		
		System.out.println(a<=b);
		System.out.println(b<=a);
		System.out.println(c<=b);
		System.out.println(b<=c);
		System.out.println(c<=a);
		System.out.println(a<=c);
		
		System.out.println("");
		
		System.out.println(a>=b);
		System.out.println(b>=a);
		System.out.println(c>=b);
		System.out.println(b>=c);
		System.out.println(c>=a);
		System.out.println(a>=c);
		
		
		System.out.println("");
		
		System.out.println(a==b);
		System.out.println(b==a);
		System.out.println(c==b);
		System.out.println(b==c);
		System.out.println(c==a);
		System.out.println(a==c);
		
		System.out.println("");
		
		System.out.println(a!=b);
		System.out.println(b!=a);
		System.out.println(c!=b);
		System.out.println(b!=c);
		System.out.println(c!=a);
		System.out.println(a!=c);
		
	}

}

//the above are conditional operators < > <= >= == !=(not equal to) ---> true/false