import java.util.Scanner;

public class String_WordRev {
	
	static String srev(String s) {
		String[] r=s.split(" ");
		String sr="";
		
		for(int i=0;i<r.length;i++) {
			StringBuilder rs=new StringBuilder(r[i]);
			rs.reverse();
			sr+=rs+" ";
		}
		return sr;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		System.out.println(srev(s));
		
		sc.close();

	}

}
