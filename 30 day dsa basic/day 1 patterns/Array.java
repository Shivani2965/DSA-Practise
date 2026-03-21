import java.util.Scanner;
class Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = s.nextInt();

        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the element to sarch:");
        int x = s.nextInt();

        Array a = new Array();

        a.pbl1(n, arr, x);
    }

    void pbl1(int size, int[] arr, int x) {
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            if (arr[i] == x) {
                System.out.println("Element " + x + " found at index: " + i);
                return;
            }
        }


    }
}