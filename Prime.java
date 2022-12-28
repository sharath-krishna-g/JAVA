import java.util.Scanner;

public class Prime {
	
	static boolean isP(int n) {
		if(n<2)
			return false;
		for(int i=2;i<=(int)Math.sqrt(n);i++)
			if(n%i==0)
				return false;
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		sc.close();
		
		System.out.println(isP(n)?"Prime":"Not Prime");
	}

}
