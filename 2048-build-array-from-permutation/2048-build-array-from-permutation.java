class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length ;
        for(int i = 0 ; i < n ; i++){
            nums[i] = nums[i] + n * (nums[nums[i]]%n); //euclid algorithm d = d*q + r ; 39 = 5 * 7 + 4
            //we mod with n because suppose nums[1] will be updated with 8 and when we reach nums[2] nums[2] is 1 but nums[1] will be 8 so we need to mod it by n bcz previous will be updated with all operation 

        }
        //we can also do multiply with nums.length bec that will be the highest num for the array
        // since the constraints is 1000 and we can apply euclids algo here 

        for(int i = 0 ; i < n ; i++){
            nums[i] = nums[i]/n;
        }
        return nums;
    }
}



//recursion 
// class Solution {
    
//     public int[] buildArray(int[] nums) {
//        rec(nums , 0 );
//        return nums; 
//     }

//     public void rec(int[] nums , int start){
//         if(start<nums.length){
//             int temp = nums[start];
//             int res = nums[temp];
//             rec(nums,start+1);
//             nums[start] = res ;
//         }
//     }
// }

 //brute force
// class Solution {
//     public int[] buildArray(int[] nums) {
//         int[] ans = new int[nums.length];
//         for(int i = 0 ; i < nums.length ; i++){
//             ans[i] = nums[nums[i]];
//         }
//         return ans;
//     }
// }