// max even max odd
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int maxEven = Integer.MIN_VALUE;
        int maxOdd = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {   
                if (arr[i] > maxEven) {
                    maxEven = arr[i];
                }
            } else {                 
                if (arr[i] > maxOdd) {
                    maxOdd = arr[i];
                }
            }
        }

        System.out.println("Max Even " + maxEven);
        System.out.println("Max Odd " + maxOdd);
    }
}

//without arg with return type
import java.util.*;
public class Main{
    public static boolean prime(){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        else{
          return false;
        }
    }
	public static void main(String[] args) {
	   System.out.println(prime());

		import java.util.*;
public class Main {
    static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 2)
            return true;
        else
            return false;
    }
     public static int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = reverse(num);
        System.out.println(rev);
        if (isPrime(num) && isPrime(rev))
            System.out.println("Twisted Prime");
        else
            System.out.println("Not Twisted Prime");
    }
}

	   System.out.println(prime());
	  
	}
}
