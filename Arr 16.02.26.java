import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          
        int arr[] = new int[n];        

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int search = sc.nextInt();     
        boolean indicate = false;

        
        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                indicate = true;
                System.out.println((i + 1) + " Position");
                break;
            }
        }

        if (indicate == false) {
            System.out.println("No data present");
        }

    }
}

//selection sort 0(n^2)
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          
        int arr[] = new int[n];  
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0;i<n;i++){
            int key  = arr[i];
            int j = i-1;
            while (j>=0 && arr [j]>key){
                arr [j+1]= arr [j];
                j--;
            }
            arr [j+1]= key;
        }
        System.out.println(Arrays.toString(arr));
    }
}

//Insertion sort

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }
}

           
       
