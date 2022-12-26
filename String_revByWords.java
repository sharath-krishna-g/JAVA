import java.util.Scanner;

public class String_revByWords {
	
	static String srev(String s) {
		String[] r=s.split(" ");
		String rs="";
		for(int i=r.length-1;i>=0;i--) 
			rs+=r[i]+" ";
		return rs;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		System.out.println(srev(s));
		
		sc.close();

	}

}
