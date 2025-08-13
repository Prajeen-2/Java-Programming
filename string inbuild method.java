//Str method
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        char mychar = name.charAt(0);
        char mychar1 = name.charAt(5);
        char mychar2= name.charAt(9);

        System.out.println(mychar);
        System.out.println(mychar1);
        System.out.println(mychar2);
    }
}

//Compare to method.java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Whats your Hobby!: ");
        String Hobby = sc.nextLine();
        
        
        int mychar = name.codePointCount(0,5);
        int result = name.compareTo(Hobby);
        
        System.out.println(mychar);
        System.out.println(result);
    }
}

//Concate

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Whats your Hobby!: ");
        String Hobby = sc.nextLine();
        
        int myresult = name.compareToIgnoreCase(Hobby);
        String result = name.concat(Hobby);
        
        System.out.println(myresult);
        System.out.println(result);
    }
}

// End with

import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        
        String name=sc.nextLine();
        String str= "";
        
        for(int i=0;i<;i++){
            str +=name.charAt(i);
        }
        
        
        System.out.println(" "  +str);
        
        System.out.println(str.endsWith("HI"));
    }
}

//Ignore equals case

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
         Scanner x = new Scanner(System.in);
        System.out.println("Enter Your Name ");
        String name =x.nextLine();
        System.out.println("Enter the Age ");
        int age =x.nextInt();
        String str=" Hello";
        String hi="Hi %s YourageIs %d";
    
        System.out.println(str.equalsIgnoreCase("Hello"));
        System.out.println(String.format(hi,name,age));
        
        
        
    }
}
//region matches

import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String a = " New World";
        String y = "Hello World";
        String x = "Hello|World|Java";
        System.out.println("Hello".matches(x));
        System.out.println("World".matches(x));
        System.out.println("JavaScript".matches(x));
        System.out.println(y.regionMatches(7,a,4,5));
    }
}

//Split method

import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String x = sc.nextLine();
        //String x = "Prajeen Kumar";
        String y = "[,\\.\\s]";
        String []z = x.split(y);
        for (String s:z){
            System.out.println(s);}
        }
    }

//Split method-2

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String x = sc.nextLine();
        int y = 7;
        String a = x.substring(0,y);
        String b = x.substring(y);
        
        System.out.println(a+" "+b);
        
        
    }
}

//Sub Sequence

import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your character");
        String x = sc.nextLine();
        CharSequence b=x.subSequence(0,7);
        CharSequence a=x.subSequence(7,12);
        System.out.println(b+" "+a);
    }
}

// Lowercase/uppercase

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        String x = data.nextLine();
        char[] y = x.toCharArray();
        
        System.out.println(x.toLowerCase());
        System.out.println(x.toUpperCase());
        System.out.println(x.toString());
    }
}
    

        
        
