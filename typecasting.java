package typecast;

public class t1 {

	public static void main(String[] args) {
		//Widening Casting
		byte b1=45;
		int i=b1;
		long l=i;
		float f=l;
		double d1=f;
		System.out.println(b1+" "+i+" "+l+" "+f+" "+d1);
		
		//Narrowing Casting
		double a=3994.938;
		float b=(float)a;
		long c=(long)b;
		int d=(int)c;
		byte e=(byte)d;
		System.out.println(a+" "+b+" "+c+" "+d+" "+e);
		
		// to String
		int as=34;
		float fs=34.45f;
		String sa=String.valueOf(as);
		String sf=String.valueOf(fs);
		System.out.println(sa+" "+sf);
		
		// to Int
		String si="44";
		String sii="Lack";
		int is=Integer.parseInt(si);
		int iis=0;
		try {
			iis = Integer.parseInt(sii);
		} catch (NumberFormatException e1) {
			System.out.println(e1);
		}
		System.out.println(is+" "+iis);
		
		// to char
		int ic=65;
		double dc=88.44;
		char ci=(char)ic;
		char cd=(char)dc;
		System.out.println(ci+" "+cd);
		
		//to Double
		String sdd="dncs";
		String sd="2353";
		Double ds=Double.parseDouble(sd);
		Double dds=0.0;
		try {
			 dds=Double.parseDouble(sdd);
		} catch (Exception e2) {
			System.out.println(e2);
		}
		System.out.println(ds+" "+dds);
	}	

}
