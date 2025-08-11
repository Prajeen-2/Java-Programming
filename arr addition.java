import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter an int:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 

        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {6, 7, 8, 9, 10};

        int[] sub = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            sub[i] = arr[i] + arr1[i] + num; 
        }

        for (int i = 0; i < sub.length; i++) {
            System.out.print(sub[i] + " ");
        }

        sc.close();
    }
}
