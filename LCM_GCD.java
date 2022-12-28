package Basic_programs;

import java.util.Scanner;

public class LCM_GCD {

	public static void main(String[] args) {
		int a,b,g=1,l;
		Scanner sc=new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
		
		for(int i=2;i<=a && i<=b;i++)
			if(a%i==0 && b%i==0)
				g=i;
		
		l=(a*b)/g;
		System.out.println("GCD = "+g+"\nLCM = "+l);
	}

}
