# JAVA

## Date and Time(Hackerrank)
```
public static String findDay(int month, int day, int year) {
        Calendar c=Calendar.getInstance();
        c.set(year, month-1, day);
        Date d=c.getTime();
        String s=new SimpleDateFormat("EEEEEE").format(d);
        return s.toUpperCase();
    }
```
or
```
public static String findDay(int month, int day, int year) {
        String dayNames[] = new DateFormatSymbols().getWeekdays();
        Calendar c=Calendar.getInstance();
        c.set(year, month-1, day);
        return dayNames[c.get(Calendar.DAY_OF_WEEK)].toUpperCase();
    }
```

## Currency Formatter(Hackerrank)
```
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        String us=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india=NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);
        String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
```

## Lambda Expressions(Hackerrank)
```
import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }

    PerformOperation isOdd(){
        return (int a) -> (a%2!=0);
    }
    
    PerformOperation isPrime(){
        return (int a) -> (java.math.BigInteger.valueOf(a).isProbablePrime(1));
    }
    
    PerformOperation isPalindrome(){
        return (int a) -> (Integer.toString(a).equals(new StringBuilder(String.valueOf(a)).reverse().toString()));
    }
}
public class Solution {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
```

## Strings Introduction
```
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1));
    }
}
```

## Substring Comparisons
```
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0, k);
        
        String t;
        for(int i=1;i<=s.length()-k;i++){
            t=s.substring(i, i+k);
            if(t.compareTo(smallest)<0)
                smallest=t;
            else if(t.compareTo(largest)>0)
                largest=t;
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
```

## String Reverse
```
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        if(A.equals(new StringBuilder(A).reverse().toString()))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
```

## Anagrams
```
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if(a.length()!=b.length())
            return false;
            
        a=a.toLowerCase();
        b=b.toLowerCase();
        
        char A[]=a.toCharArray();
        char B[]=b.toCharArray();
    
        java.util.Arrays.sort(A);
        java.util.Arrays.sort(B);
        
        return java.util.Arrays.equals(A,B); 
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
```
