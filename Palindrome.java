package Basic_programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		String r=new StringBuilder(s).reverse().toString();
		
		sc.close();
		
		System.out.println(s.equals(r)?"yes":"no");
	}

}
