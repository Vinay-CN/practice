class Solution {
    public int missingNumber(int[] nums) {
     int n=nums.length;
     int nsum=n*(n+1)/2;
     int toatal =0;
     for(int num:nums)
     {
         toatal+=num;
     }   
     return nsum-toatal;
    }
}