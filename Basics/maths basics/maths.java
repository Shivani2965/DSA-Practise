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
        // printN(n);
        // printDivisor(n);
        // findPrime(n);
        // findFactors(n);
        countPrimes(n);
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

    static void armstrong(int n) {
        int r = 0;
        int sum = 0;
        int N = n;
        while (n > 0) {
            sum = n % 10;
            r = r + (sum * sum * sum);
            n = n / 10;
        }

        if (N == r) {
            System.out.println(N + " Number is Armstrong");
        } else {
            System.out.println(N + " Number is not Armstrong");
        }
    }

    static void printN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    static void printDivisor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    static void findPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;

            }

        }
        if (count == 2) {
            System.out.println("\n" + n + " is a prime number");
        } else {
            System.out.println("\n" + n + " is not a prime number");
        }
    }

    static void findFactors(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);

            }
            if ((n / i) != i) {
                System.out.println(n / i);
            }
        }
    }

    public static void countPrimes(int n) {
        int count=0;

        for (int i=1 ; i<=n;i++){
            if (n%i==0){
                System.out.println(i);
                count++;
            }
            
        }
        System.out.println(count);


        
    }
}
