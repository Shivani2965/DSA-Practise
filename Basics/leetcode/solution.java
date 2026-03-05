import java.util.Scanner;

class solution {

    // fibo
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + (fib(n - 2));
    }

    // palindrone number

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }

        }
        return true;

    }

    public static boolean isPalindrome1(int x) {
        String s = String.valueOf(x);
        int n = s.length();
        int sum = 0;
        int rev = 0;

        while (n < 1) {

            sum = n % 10;
            n = n / 10;
            rev = rev + sum;
        }
        if (n != rev)
            return false;
        else{
            return true;
        }

    }
    // target query address and return the value of that address
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0 ;
        int right = nums.length-1;
        while (left<=right){
            int mid  = left + (right-left)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }



    // palindrome of string ignoring punchutuation and spaces

    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);

        // System.out.println("Enter n:");
        // int x = s.nextInt();

        // System.out.println(fib(n));
        System.out.println(isPalindrome1(x));
    }
}