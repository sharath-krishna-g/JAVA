# Hackerrank Solutions

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
## String Tokens
```
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
  
        if(s.trim().length()==0)
            System.out.println(0);
        else{
            String r[]=s.trim().split("[\\s\\!\\,\\?\\.\\_\\'\\@]+");
            System.out.println(r.length);
            for(int i=0;i<r.length;i++)
                System.out.println(r[i]);
        }
        scan.close();
    }
}
```

## Pattern Syntax Checker
```
import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
            
            try{
                Pattern.compile(pattern); 
                System.out.println("Valid");
            }catch (Exception e){
                System.out.println("Invalid");
            }
            
            testCases--;
		}
	}
}
```

## Regex
```
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
    static String s="([0-9]{1,2}|[2][0-5]{1,2}|[0][0-9]{1,2}|[1][0-9]{1,2}|[2][0-4][0-9])";
    public static String pattern=s+"\\."+s+"\\."+s+"\\."+s;
}
```

## Regex 2 - Duplicate Words
```
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s+\\1\\b)*";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            while (m.find()) {
                input = input.replaceAll(m.group(0),m.group(1));
            }
            
            System.out.println(input);
        }
        
        in.close();
    }
}
```

## Valid Username RE
```
import java.util.Scanner;
class UsernameValidator {
    public static final String regularExpression = "[a-zA-Z]{1}[\\w]{7,29}";
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
```

## Tag Content Extractor
```
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
                Pattern p=Pattern.compile("<(.+)>([^<]+)</\\1>");
		while(testCases>0){
			String line = in.nextLine();
			Matcher m=p.matcher(line);
            if(!m.find())
                System.out.println("None");
            else{
                do{
                    System.out.println(m.group(2));
                }while(m.find());
            }
			testCases--;
		}
	}
}
```

## BigDecimal
```
import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
        
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n;j++){
                if(Double.parseDouble(s[j-1])<Double.parseDouble(s[j])){
                    String t=s[j-1];
                    s[j-1]=s[j];
                    s[j]=t;
                }
            }
        }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
```

## Primality Test
```
import java.io.*;
import java.math.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        
        BigInteger r=new BigInteger(n);
        if(r.isProbablePrime(1))
            System.out.print("prime");
        else
            System.out.print("not prime");
	    
        bufferedReader.close();
    }
}
```

## BigInteger
```
import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        BigInteger a=new BigInteger(sc.next());
        BigInteger b=new BigInteger(sc.next());
    
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
```

## 1D Array
```
import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=scan.nextInt();
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
```

## 2D Array
```
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        
        int s=Integer.MIN_VALUE;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int t=arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)+arr.get(i+1).get(j+1)+arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
                if(s<t)
                    s=t;
            }
        }
        
        System.out.println(s);
        bufferedReader.close();
    }
}
```

## Subarray
```
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        int c=0;
        for(int i=0;i<n;i++){
            int t=0;
            for(int j=i;j<n;j++){
                t+=a[j];
                if(t<0)
                    c++;
            }
        }
        
        System.out.println(c);
    }
}
```

## ArrayList
```
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        int n=sc.nextInt();
        while(n-->0){
            int d=sc.nextInt();
            ArrayList<Integer> t=new ArrayList<>();
            for(int i=0;i<d;i++)
                t.add(sc.nextInt());
            a.add(t);
        }
        
        int q=sc.nextInt();
        while(q-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            
            try{
                int r=a.get(x-1).get(y-1);
                System.out.println(r);
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
```

## 1D Array(Part 2)
```
import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game,int i) {
        if(i>game.length-1)
            return true;
        else if(i<0 || game[i]==1)
            return false;
        game[i]=1;
        
        return canWin(leap, game, i+1) || canWin(leap, game, i-1) || canWin(leap, game, i+leap);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game,0)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
```

## List
```
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++)
            l.add(i,sc.nextInt());
            
        int q=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<q;i++){
            String s=sc.next();
            if(s.equals("Insert"))
                l.add(sc.nextInt(),sc.nextInt());
            else
                l.remove(sc.nextInt());  
        }
        
        for(int i:l)
            System.out.print(i+" ");
    }
}
```

## Map
```
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
        Map<String, String> m=new HashMap<>();
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			String phone=in.nextLine();
            		m.put(name, phone);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            		if(m.containsKey(s))
                		System.out.println(s+"="+m.get(s));
            		else 
                		System.out.println("Not found");
		}
	}
}
```

## Stack
```
import java.util.*;

class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            
            Stack<Character> s=new Stack<>();
            for(int i=0;i<input.length();i++){
                if(!s.empty()){
			if(s.peek()=='{' && input.charAt(i)=='}')
			    s.pop();
			else if(s.peek()=='[' && input.charAt(i)==']')
			    s.pop();
			else if(s.peek()=='(' && input.charAt(i)==')')
			    s.pop();
			else
			    s.push(input.charAt(i));
			}
		else{
		    s.push(input.charAt(i));
                }
            }
            
            if(s.empty())
                System.out.println("true");
            else
                System.out.println("false");
		}
	}
}
```

## Hashset
```
import java.util.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
        Set<String> set=new HashSet<>();
        for(int i=0;i<t;i++){
            set.add(pair_left[i]+" "+pair_right[i]);
            System.out.println(set.size());
        }
    }
}
```

## Generics
```
import java.lang.reflect.Method;

class Printer
{
    public <E> void printArray(E[] a){
        for(E i:a)
            System.out.println(i);
    }
}

public class Solution {

    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}
```

## Comparator
```
import java.util.*;

class Checker implements Comparator<Player>{
    public int compare(Player a, Player b){
        if(a.score<b.score)
            return 1;
        else if(a.score==b.score)
            return a.name.compareTo(b.name);
        return -1; 
    }
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
```

## Sort
```
import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
      
        Comparator<Student> c=(Student o1,Student o2)->{
            return o1.getCgpa()==o2.getCgpa()?o1.getFname().compareTo(o2.getFname()):o1.getCgpa()<o2.getCgpa()?1:-1;
        };
        
        Collections.sort(studentList,c);
        
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}
```

## Dequeue
```
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        Set<Integer> s=new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int r=0;
        
        for (int i = 0; i < n; i++) {
            int num=in.nextInt();
            deque.add(num);
            s.add(num);
            
            if(i>=m-1){
                r=Math.max(r, s.size());
                int a=(int)deque.poll();
                if(!deque.contains(a))
                    s.remove(a);
            }
        }   
        System.out.print(r);
    }
}
```

## BitSet
```
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int m=sc.nextInt();
        BitSet b1=new BitSet(n);
        BitSet b2=new BitSet(n);
        
        while(m-->0){
            String q=sc.next();
            int q1=sc.nextInt();
            int q2=sc.nextInt();
            if(q.equals("AND")){
                if(q1==1)
                    b1.and(b2);
                else
                    b2.and(b1);
            }
            else if(q.equals("SET")){
                if(q1==1)
                    b1.set(q2);
                else
                    b2.set(q2);
            }
            else if(q.equals("FLIP")){
                if(q1==1)
                    b1.flip(q2);
                else
                    b2.flip(q2);
            }
            else if(q.equals("OR")){
                if(q1==1)
                    b1.or(b2);
                else
                    b2.or(b1);
            }
            else{
                if(q1==1)
                    b1.xor(b2);
                else
                    b2.xor(b1);
            }
            System.out.println(b1.cardinality()+" "+b2.cardinality());
        }
    }
}
```
