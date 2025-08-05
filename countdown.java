import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int i =10;
        Scanner data = new Scanner(System.in);
        
        for (int countDown = 10; countDown >= 0; countDown--) {
            System.out.println(countDown);
            if (countDown == 1)
            {
                System.out.println("Launch");
                break;
            }
        }
    }
 }
 
        
