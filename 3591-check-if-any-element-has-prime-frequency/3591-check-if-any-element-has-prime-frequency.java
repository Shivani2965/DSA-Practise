class Solution {
    static boolean isPrime(int n) {
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for(int i = 3; i*i <= n; i+=2) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        int n = nums.length;
        boolean visited[] = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(visited[i] == true) 
            continue;

            int count = 1;
            for(int j = i+1; j < n; j++) {
                if(nums[i] == nums[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if(isPrime(count)) 
              return true;
        }
        return false;
    }
}