class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap <Integer, Integer> counts = new HashMap<>();
        for (int num :nums){
            counts.put(num, counts.getOrDefault(num, 0)+1);

        }

        for (int count: counts.values()){
            if(isPrime(count)){
                return true;
            }
        }
        return false;
    }

    public boolean isPrime(int n){
    int c = 0;

    for(int i = 1; i <= n; i++){
        if(n % i == 0){
            c++;
        }
    }

    return c == 2;
}
}