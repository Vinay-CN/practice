class Solution {
    public void moveZeroes(int[] nums) {
        // int i = 0 , j = 0 ;
        // while(j<nums.length){
        //     if(nums[j]!=0) { //just like 0 - 1 sorting  i will be at 0  and j will be at non-zero so we can swap;
        //         int temp = nums[j];
        //         nums[j] = nums[i] ;
        //         nums[i] = temp;
        //         i++;
        //     }
        //     j++;
        // }

        int lastNonZeroFoundAt = 0;
        // If the current element is not 0, then we need to
        // append it just in front of last non 0 element we found. 
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]!=0){
                nums[lastNonZeroFoundAt++] =nums[i];
            }
        }

        for(int i =lastNonZeroFoundAt ;i < nums.length ; i++ ){
            nums[i] = 0;
        }
    }
}