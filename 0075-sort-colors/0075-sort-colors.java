class Solution {
    public void swap(int[] nums , int i , int j){
        int temp = nums[i] ; 
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int k = nums.length -1 ;
        while(nums[k]==2 && k>0) k--; //k+1 to end must be 2's region so we will decrease k till we find non - 2 element
        int i = 0 , j = 0 ; //i -1 to 0 is 0's region i to j is 1's region ;
        while(j<=k){ //2 0 1 edge case 
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