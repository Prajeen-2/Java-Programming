import java.util.*;
public class Main{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    byte a = sc.nextByte();
    short b = sc.nextShort();
    int c = sc.nextInt();
    float d = sc.nextFloat();
    long e = sc.nextLong();
    double f = sc.nextDouble();
    String str1 = sc.next();
    String str2 = sc.nextLine();
    char ch = sc.next().charAt(0);
    
    System.out.println(a+" "+b);
    System.out.println(c+" "+d);
    System.out.println(e+" "+f);
    System.out.println(str1+" "+str2);
    System.out.println(ch);
      
    }
}
// Sum logic 
import java.util.*;
public class Main{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();
    int sum=0;
    while(a>0){
        int r = a%10;
        sum = sum +r;
        a=a+10;
    }
    System.out.println(sum);
    }
}
    
// Reverse  logic

import java.util.*;
public class Main{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();
    int rev=0;
    while(a>0){
        int r = a%10;
        rev = rev *10+r;
        a=a/10;
    }
    System.out.println(rev);
    }
}
    


