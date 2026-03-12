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

    public static void moveZeros(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }
        System.out.print("After moving zeros: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    // palindrome of string ignoring punchutuation and spaces




    //6 march
    //intteger to roman
    public static String intToRoman(int num) {
        String[] m = {"", "M", "MM", "MMM"};
        String[] c = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] x = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] i = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return m[num / 1000] + c[(num % 1000) / 100] + x[(num % 100) / 10] + i[num % 10];
    }

    // roman to integer
    public static int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'I') {
                sum += 1;
            } else if (c == 'V') {
                sum += 5;
            } else if (c == 'X') {
                sum += 10;
            } else if (c == 'L') {
                sum += 50;
            } else if (c == 'C') {
                sum += 100;
            } else if (c == 'D') {
                sum += 500;
            } else if (c == 'M') {
                sum += 1000;
            }
        }
        return sum;
    }


    public String multiply(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int ans= n1*n2;
        return String.valueOf(ans);
    }

    public int[] plusOne(int[] digits) {
        
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    //08/03/2026

    public static void lengthOfLastWord( String s){
        String[] words = s.trim().split(" ");
        int length = words[words.length - 1].length();
        System.out.println("Length of the last word: " + length);
    }

    //10/03/2026
    public static void RemoveDuplicatesFromSortedArray(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i+1]) {
                arr[count] = arr[i];
                count++;
            }
        }
        arr[count] = arr[arr.length-1];
        count++;
        System.out.print("After removing duplicates: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
     public static int bitwiseComplement(int n) {
        if (n == 0) return 1;
        int mask = (1 << (32 - Integer.numberOfLeadingZeros(n))) - 1;
        return n ^ mask;
    }

    public static int lengthOfLastWord1(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (length > 0) {
                    break;
                }
            } else {
                length++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);

        // System.out.println("Enter n:");
        // int n = s.nextInt();

        // // System.out.println(fib(n));
        // System.out.println(isPalindrome1(x));

        // moveZeros(new int[]{0, 1, 0, 3, 12});
        // System.out.println(intToRoman(n));
        // // System.out.println(romanToInt("IV"));
        // System.out.println(new solution().multiply("123", "456"));
        //     // 
            
        // RemoveDuplicatesFromSortedArray(new int[]{1, 1, 2, 2, 3, 4, 4, 5});
        // bitwiseComplement(10);
        lengthOfLastWord("Hello World");
    }
}