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


