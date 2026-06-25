class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        final List<List<Integer>> res =new ArrayList<>();
        for (int i=0; i<nums.length-2; i++){
            if(nums[i]>0){
                break;
            }
            if(i>0 && nums[i] ==nums[i-1]){
                continue;
            }

            int j =i+1;
            int k= nums.length -1;

            while(j<k){
                if(nums[i] +nums[j]>0){
                    break;
                }
                if(j>i+1 && nums[j] == nums[j-1]){
                    j++;
                    continue;
                }

                if(nums[i] +nums[j] +nums[k] <0){
                    j++;
                } else if(nums[i] + nums[j] +nums[k] >0){
                    k--;
                }else{
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
            }
        }
        return res;
    }
}