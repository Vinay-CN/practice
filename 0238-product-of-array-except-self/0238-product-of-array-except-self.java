class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length ;
      int[] pref = new int[n];
      pref[0] = nums[0];
      int[] suf = new int[n];
      suf[n-1] = nums[n-1];
        for(int i = 1 ; i < n ; i++){
            pref[i] = pref[i-1]*nums[i]; //get suffix
            suf[n-i-1] = nums[n-i-1]*suf[n-i]; //get prefix
        }

        int[] ans = new int[n];
        for(int i = 0 ; i < n ; i++){
           if(i==0)  ans[i] = suf[i+1] ;  //for first element suffix till that element will be product
           else if(i==n-1) ans[i] = pref[i-1]; //for last element prefix till that ellement will be product
           else 
            ans[i] = pref[i-1]*suf[i+1]; //product till me * product after me;
        }
        return ans;
    }
}