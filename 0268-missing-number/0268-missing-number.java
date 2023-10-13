class Solution {
    public int missingNumber(int[] nums) {
        int n  = nums.length ;
        int nSum = n*(n+1)/2;
        int aSum = 0;
        for(int a : nums){
            aSum+=a;
        }
        return nSum-aSum;
    }
}