import java.util.Scanner;

public class Recursion2 {
    static void printSum(int i, int sum){
        if (i<1){
            System.out.println(sum);
            return;
        }
        printSum(i-1, sum+i);
    }

    static void PrintN(int n){
        if (n<1){
            return;
        }
        System.out.println(n);
        PrintN(n-1);

    }

    static void PrintSum(int n){
        if (n==0){
            return;
        }
        PrintSum(n-1);
    }

    static int factn(int n){
        
        if ( n==0 || n==1)
            return 1;
        
        return n * factn(n-1);
    }

static void f(int i, int arr[], int n){
    if (i>=n/2){
        return;
    }
    // swap
    int temp = arr[i];
    arr[i] = arr[n-i-1];
    arr[n-i-1] = temp;

    f(i+1, arr, n);
}

public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = s.nextInt();
        // printSum(n, 0);

        // s.close();
        // PrintN(5);
        // System.out.println(factn(5));



        int arr[] = new int[n];
        for (int i =0; i<n; i++){
            arr[i] = s.nextInt();
        }

        f(0, arr, n);
        for (int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
