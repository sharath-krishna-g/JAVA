package Basic_programs;

import java.util.Scanner;

public class Fibonacci {
	
	static long fib(long n) {
		if(n<=0 || n==1)
			return 0;
		if(n==2 || n==3)
			return 1;
		return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		long n=sc.nextInt();
		sc.close();
		System.out.println(fib(n));
	}

}
