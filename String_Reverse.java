package Basic_programs;

import java.util.Scanner;

public class String_Reverse {
	
	static String srev(String s) {
		StringBuilder sr=new StringBuilder(s);
		sr.reverse();
		return sr.toString();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		System.out.println(srev(s));
		
		sc.close();

	}

}
