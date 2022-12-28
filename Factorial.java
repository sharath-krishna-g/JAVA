package Basic_programs;

import java.util.Scanner;

public class Factorial {

	static long fact(long n) {
		
		if(n<0)
			return 0;
		
		if(n==0 || n==1)
			return 1;
		
		return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		long n=sc.nextInt();
		sc.close();
		System.out.println(fact(n));
	}

}
