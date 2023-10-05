class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length] ; 
        int curr = 1 ;
        Arrays.fill(ans,1);
        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = ans [i] * curr ;
            curr = curr * nums[i];
        }

        curr = 1;
        for(int i = nums.length -1 ; i>=0 ; i-- ){
            ans[i] = ans[i]* curr;
            curr = curr * nums[i];
        }

        return ans;
    }
}


/*class Solution {
    public int[] productExceptSelf(int[] nums) {
             //  O(N)
        int n = nums.length;
        int countZeroes = 0;
        int indexZero = -1;
        int productWithoutZero = 1;
        //count zeros , if zeros greater than or equal to 2 then whole array will be zero else one zero means except oth position everthing will be zero  
        for(int i = 0 ; i < n ; i++) {
            if(nums[i] == 0) {
                countZeroes++;   //zero means increase the count and store the index
                indexZero = i;
            }
            else {
                productWithoutZero *= nums[i]; //else just multiply
            }
        }
        
        int [] output = new int [n];
        if(countZeroes == 0) {        // 0 zeros means we can get multiply by dividing the number by totalproduct
            for(int i = 0 ; i < n ; i++) {
                output[i] = productWithoutZero / nums[i];
            }
        }
        else if(countZeroes == 1) { //one zero means we know everthing will be zero except zeroth position so we change zeroth position 
            output[indexZero] = productWithoutZero;
        }
        return output;
    }
}*/


/*class Solution {
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
}*/