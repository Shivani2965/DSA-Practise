class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        int i=0;

        while(i<=high){
        if(nums[i]==0){
            swap(nums, i++, low++);

        }
        else if(nums[i]==2){
            swap(nums, i, high--);
        }
        else{
            i++;
        }

        }

        // while (mid <= high) {
        //     if (nums[mid] == 0) {
        //         swap(nums, low, mid);
        //         low++;
        //         mid++;
        //     } else if (nums[mid] == 1) {
        //         mid++;
        //     } else {
        //         swap(nums, mid, high);
        //         high--;
        //     }
        // }
    }
        


    public void swap(int[] nums, int i1, int i2) {
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }

    //bruteforce method using bubble sort:
    // for(int i=0; i<n-1; i++){

    //     for(int j=0; j<n-i-1; j++ ){
    //         if(nums[j]>nums[j+1]){
    //             int temp = nums[j];
    //             nums[j]= nums[j+1];
    //             nums[j+1]= temp;
    //         }
    //     }
    // }

}