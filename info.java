import java.util.Scanner;
class Main
{
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Your Name:");
String name=sc.nextLine();
System.out.print("Enter Your Age:");
int age=sc.nextInt();
System.out.print("Enter Your Weight:");
float weight=sc.nextFloat();
System.out.print("Enter Your Gender:");
char gender=sc.next().charAt(0);
System.out.print("You are Single ( TRUE/FALSE):");
boolean bool=sc.nextBoolean();
System.out.println(name);
System.out.println(age);
System.out.println(gender);
System.out.println(weight);
System.out.println(bool);
}
}
