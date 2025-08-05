import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        int num;
        System.out.println("Enter your Number:");
        num = data.nextInt();

        while (num > 0){
            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
            num--;  
        }
    }
}
