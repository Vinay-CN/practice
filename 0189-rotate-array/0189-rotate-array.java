class Solution {
    public void reverse(int[] nums , int start , int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k%nums.length ; //if k == nums.length then rotated array will be same so we need to rotate it k%n times;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1); //if k = 101 then we will move out of range so mod it
        reverse(nums,k,nums.length-1);
    }
}