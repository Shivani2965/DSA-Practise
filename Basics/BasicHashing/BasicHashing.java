    import java.util.*;

public class BasicHashing {

    public static void main(String[] args) {

        // /* -----------------------------
        //    1. Hashing Numbers (Array)
        //    ----------------------------- */

        int[] arr = {1, 2, 3, 1, 3, 2, 1};
        int max = 10; // range of numbers
        int[] hash = new int[max + 1];

        // build hash
        for (int num : arr) {
            hash[num]++;
        }

        // queries
        int[] queries = {1, 2, 3, 4};
        for (int q : queries) {
            System.out.println("Frequency of " + q + " = " + hash[q]);
        }

        // System.out.println("----------------------------");

        // /* -----------------------------
        //    2. Hashing Numbers (HashMap)
        //    ----------------------------- */

        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int num : arr) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        // for (int q : queries) {
        //     System.out.println("Frequency of " + q + " = " + map.getOrDefault(q, 0));
        // }

        // System.out.println("----------------------------");

        // /* -----------------------------
        //    3. Hashing Characters
        //    ----------------------------- */

        // String s = "aabbccdde";
        // int[] charHash = new int[26];

        // for (char ch : s.toCharArray()) {
        //     charHash[ch - 'a']++;
        // }

        // char[] charQueries = {'a', 'b', 'z'};
        // for (char c : charQueries) {
        //     System.out.println("Frequency of " + c + " = " + charHash[c - 'a']);
        // }

        // System.out.println("----------------------------");

        // /* -----------------------------
        //    4. Hashing Characters (HashMap)
        //    ----------------------------- */

        // HashMap<Character, Integer> charMap = new HashMap<>();

        // for (char ch : s.toCharArray()) {
        //     charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        // }

        // for (char c : charQueries) {
        //     System.out.println("Frequency of " + c + " = " + charMap.getOrDefault(c, 0));
        // }

        // Scanner s = new Scanner(System.in);
        // System.out.print("Enter the value of n : ");
        // int n = s.nextInt();
        // int arr[] = new int[n];
        // System.out.print("Enter values of array : ");
        // for (int i=0;i<n;i++){
        //     arr[i] = s.nextInt();
        // }
        // //precompute
        // Map<Integer,Integer> map = new HashMap<>();
        // for (int i=0;i<n;i++){
        //     map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        // }
        // System.out.print("Enter value of query : ");
        // int query = s.nextInt();
        // System.out.print("Enter numbers to find count in array : ");
        // while (query >= 0){
        //     int number = s.nextInt();
        //     query--;
        //     //fetch method
        //     System.out.println(map.getOrDefault(number, 0));
        // }
    }
}
