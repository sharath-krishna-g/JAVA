package Basic_programs;

import java.util.Scanner;

public class Star_Patterns {
	
	public void rightTriangle(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	
	public void revRTriangle(int n) {
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}

	public void leftTriangle(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=2*(n-i);j>=1;j--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	
	public void pyramid(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>=1;j--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();	
		}
		System.out.println();
		System.out.println();
	}
	
	public void diamond(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>=1;j--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=n-i;j>=1;j--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		Star_Patterns s=new Star_Patterns();
		
		s.rightTriangle(n);
		s.revRTriangle(n);
		s.leftTriangle(n);
		s.pyramid(n);
		s.diamond(n);
		
		sc.close();
		
	}
}
