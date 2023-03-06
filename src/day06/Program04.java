package day06;

public class Program04 {

	public static void main(String[] args) {
		//&& || !
		int a = 100;
		int b = 20;
		int c = 30;
		
		System.out.println((a>b) && (a>c));//t
		System.out.println((b>a) && (b>c));//f
		System.out.println((c>b) && (c>a));//f
		
		System.out.println("");
		
		System.out.println((a<b) && (a<c));//f
		System.out.println((b<a) && (b<c));//t
		System.out.println((c<b) && (c<a));//f
		
		System.out.println("");
		
		System.out.println((a>b) && (a<c));//f
		System.out.println((b>a) && (b<c));//f
		System.out.println((c>b) && (c<a));//t
		
		System.out.println("");
		
		System.out.println((a<b) && (a>c));//f
		System.out.println((b<a) && (b>c));//f
		System.out.println((c<b) && (c>a));//f
		
		System.out.println("");
		
		System.out.println((a>b) || (a>c));//t
		System.out.println((b>a) || (b>c));//f
		System.out.println((c>b) || (c>a));//t
		
		System.out.println("");
		
		System.out.println((a<b) || (a<c));//f
		System.out.println((b<a) || (b<c));//t
		System.out.println((c<b) || (c<a));//t
		
		System.out.println("");
		
		System.out.println((a<b) || (a>c));//t
		System.out.println((b<a) || (b>c));//t
		System.out.println((c<b) || (c>a));//f
		
		System.out.println("");
		
		System.out.println((a>b) || (a<c));//t
		System.out.println((b>a) || (b<c));//t
		System.out.println((c>b) || (c<a));//t
		
		System.out.println("");
		
		
		System.out.println(!(a>c));//f
		System.out.println(!(a>b));//f
		System.out.println(!(b>a));//t
		System.out.println(!(b>c));//t
		System.out.println(!(c>b));//f
		System.out.println(!(c>a));//t
		
		System.out.println("");
		
		System.out.println(!(a<c));//t
		System.out.println(!(a<b));//t
		System.out.println(!(b<a));//f
		System.out.println(!(b<c));//f
		System.out.println(!(c<b));//t
		System.out.println(!(c<a));//f
	}

}

//logical operators && and , or || , Not !