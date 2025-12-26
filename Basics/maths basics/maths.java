import java.util.Scanner;

public class maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sc.nextInt();
        // countDigits(n);
        // reverseNumber(n);
        // palindrome(n);
        // armstrong(n);
        printN(n);
    }

    static void countDigits(int n) {
        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }

    static void reverseNumber(int n) {
        int r = 0;
        int sum = 0;
        while (n > 0) {
            sum = n % 10;
            r = r * 10 + sum;
            n = n / 10;
        }
        System.out.println("REversed number: " + r);
    }

    static void palindrome(int n) {
        int r = 0;
        int sum = 0;
        int N = n;
        while (n > 0) {
            sum = n % 10;
            r = r * 10 + sum;
            n = n / 10;
        }
        if (N == r) {
            System.out.println(N + " Number is Palindrome");
        } else {
            System.out.println(N + " Number is not palindorme number");
        }
    }

    static void armstrong(int n){
        int r = 0;
        int sum = 0;
        int N =n;
        while (n>0){
            sum = n % 10;
            r = r + (sum  * sum * sum);
            n = n / 10;
        }

        if (N == r){
            System.out.println(N + " Number is Armstrong");
        } else {
            System.out.println(N + " Number is not Armstrong");
        }
    }

    static void printN(int n){
        for(int i =1; i<=n; i++){
            System.out.println(i);
        }
    }
}
