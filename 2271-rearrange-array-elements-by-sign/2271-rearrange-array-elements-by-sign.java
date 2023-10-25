class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length ;

       int[] pos = new int[n/2];
       int[] neg = new int[n/2]; 
        int posI = 0;
        int negI = 0 ;
       for(int i = 0 ; i < n ; i++){
           if(nums[i]<0) {
               neg[negI++] = nums[i];
           }
           else{
               pos[posI++] = nums[i];
           }
       }
        posI = 0;
        negI = 0 ;
       for(int i = 0 ; i < n ; i++){
           nums[i++] = pos[posI++];
           nums[i] = neg[negI++] ; 
       }

       return nums;
    }
}