class Solution {
    public void swap(int i , int j , int[] nums){
        int temp = nums[i] ;
        nums[i] = nums[j] ;
        nums[j] = temp;
    }
    public int removeDuplicates(int[] nums) {
        if(nums.length==1) return 1;
        int j = 0 ;
        int i = 0 ;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                i++;
                swap(i,j,nums);
            }
            j++;
        }
        return i+1;
    }
}