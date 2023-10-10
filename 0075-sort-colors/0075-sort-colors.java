class Solution {
    public void swap(int[] nums , int i , int j){
        int temp = nums[i] ; 
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int k = nums.length -1 ;
        while(nums[k]==2 && k>0) k--;
        int i = 0 , j = 0 ;
        while(j<=k){
            if(nums[j]==0){
                swap(nums,i,j);
                i++;
                j++;
            }
            else if(nums[j]==2){
                swap(nums,j,k);
                k--;
            }
            else
            {
                j++;
            }
        }
    }
}