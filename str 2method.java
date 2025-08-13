import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the String");
        String x = data.nextLine(); 
        char y = x.charAt(0);
        System.out.println(y);
         
        int a = x.codePointAt(0);
        System.out.println(a);
        
        int b = x.codePointBefore(2);
        System.out.println(b);
    }
}


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the String1");
        String x = data.nextLine(); 
        System.out.println("Enter the String2");
        String y = data.nextLine();
        
        int a = x.codePointCount(0,4);
        System.out.println(a);
        
        int b = x.compareTo(y);
        System.out.println(b);
    }
}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the String1");
        String x = data.nextLine(); 
        System.out.println(x.contains("Re"));
        System.out.println(x.contains("ji"));
        System.out.println(x.contentEquals("Reji"));
        System.out.println(x.contentEquals("Re"));
        
    }
}


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    
        Scanner data = new Scanner(System.in);
        char[] d = {'H','E','L','L','O'};
        String str = "hello";
        
        System.out.println(str.copyValueOf(d,0,5));
        System.out.println(str.endsWith("lo"));
        System.out.println(d.equals(str));
        
        
    }
}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the String:");
        String a = data.nextLine();
        System.out.println(a.equalsIgnoreCase("Reji"));
        String b ="Hi %s my age %d";
        String result = String.format(b,"Reji",19);
        System.out.println(result);
        
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
         
     char[] data = {'0','1','2','3','4','5','6','7','8','9'};

     String myString = "HelloWorld!";
     myString.getChars(5,11,data,4);
     System.out.println(data);
       
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
         
   String name = "mangudi";
   byte [] a = name.getBytes();
   System.out.println(a[0]);
       
    }
}



import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
         
   String name = "mangudi";
   byte [] a = name.getBytes();
   System.out.println(name.hashCode());
       
    }
}


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
         
        String x = "hello world";
        System.out.println(x.indexOf("world"));
       
    }
}


import java.util.Scanner;
class main{
    public static void main(String [] args){
        Scanner data =  new Scanner(System.in);
        
        String x = "hello";
        System.out.println(x.isEmpty());
    }
}


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String x = String.join("Reji","R","S");
        System.out.println(x);
    }
}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String x = "Helloworld";
        System.out.println(x.lastIndexOf("world"));
    }
}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String x = "Helloworld";
        System.out.println(x.length());
    }
}

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner data = new Scanner(System.in);
        String a = "New world";
        String y = "_Hello_World";
        String x = "Hello|World|Java";
        System.out.println("Hello".matches(x));
        System.out.println("World".matches(x));
        System.out.println("JavaScript".matches(x));
        System.out.println(y.regionMatches(7,a,4,5));
    }
}

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner data = new Scanner(System.in);
        String a = "(?i)Hello";
        String y = "Hello Reji Hello";
        String x = "Hello";
        System.out.println(x.replace('l','p'));
        System.out.println(y.replaceAll(a,"Hi"));
        String b ="Hello";
        System.out.println(y.replaceFirst(b,"Hi"));
    }
}

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner data = new Scanner(System.in);
        String x = "Hello world";
        String y = "[,\\ .\\s]";
        String[] z = x.split(y);
        for(String s : z){
            System.out.println(s);
        }
    }
}

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner data = new Scanner(System.in);
        //System.out.println("Enter the String");
        String x = "Hello";
        // String y = data.nextLine();
        
        System.out.println(x.startsWith("Hello"));
        System.out.println(x.startsWith("he"));
    }
}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String name="helloworld";
        CharSequence b=name.subSequence(0,5);
        CharSequence a=name.subSequence(5,10);
        System.out.println(b+" "+a);
        
    }
}

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner data = new Scanner(System.in);
        String x = "Helloworld";
        int y = 5;
        String a = x.substring(0,y);
        String b = x.substring(y);
        
        System.out.println(a+" "+b);
        
        
    }
}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String x="hello_world";
        char[] y = x.toCharArray();
        System.out.println(y[0]);
        
    }
}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        String x = data.nextLine();
        char[] y = x.toCharArray();
        for(char s:y){  
            System.out.println(s);
        }
        System.out.println(x.toLowerCase());
        System.out.println(x.toUpperCase());
        System.out.println(x.toString());
    }
}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        String x = data.nextLine();

        System.out.println(x.trim());
        System.out.println(String.valueOf(x));
        System.out.println(String.valueOf(true));
    }
}
