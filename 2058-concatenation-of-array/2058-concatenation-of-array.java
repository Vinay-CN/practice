class Solution {
    public int[] getConcatenation(int[] nums) {
        int n =  2 * nums.length;
        int[] ans = new int[n];
        int j = 0 ;
        for(int i= 0 ; i < n ; i++)
        {
            if(i==nums.length) j = 0; // when we reach end of given array reassign to first index
            ans[i] = nums[j];
            j++;
        }
        return ans;
    }
}