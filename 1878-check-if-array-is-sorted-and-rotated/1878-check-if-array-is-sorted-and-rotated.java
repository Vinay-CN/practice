
//O(N)
class Solution {
    public boolean check(int[] nums) {
        int count = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]>nums[(i+1)%nums.length])count++;
            if(count>1) return false;
        }
        return true;
    }
}



// 2 1 3 4 imagine circularly 0 1 2 3 nums[3] > nums[3+1 % 4] nums[3] > nums[0] measn not sorted 