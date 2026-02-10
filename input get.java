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
// count the factors 
import java.util.*;

public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int count = 0;
      for (int i =2 ; i<=num/2;i++){
          if(num%i==0){
              count++;
          }
          
      }
      System.out.println(count+2);
        
    }
}
//Leap year

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int year = scan.nextInt();
      if ((year%4==0 && year %100!=0 || year%400==0)){
        System.out.println("Leap year");
      }
      else{
        System.out.println("not an leap year");
      }
    }
}

//word for number
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        switch (num) {
            case 0: System.out.println("zero"); break;
            case 1: System.out.println("one"); break;
            case 2: System.out.println("two"); break;
            case 3: System.out.println("three"); break;
            case 4: System.out.println("four"); break;
            case 5: System.out.println("five"); break;
            case 6: System.out.println("six"); break;
            case 7: System.out.println("seven"); break;
            case 8: System.out.println("eight"); break;
            case 9: System.out.println("nine");
        }
    }
}

//factorial

import java.util.*;

public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int mul = 1;
      for (int i =1 ; i<=num;i++){
          mul =  mul*i;
      }
      System.out.println(mul);
    }
}

//fibo

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); 

        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < num; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }
}


      
    


