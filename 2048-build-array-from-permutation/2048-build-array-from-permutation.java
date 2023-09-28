class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length ;
        for(int i = 0 ; i < n ; i++){
            nums[i] = nums[i] + 1001 * (nums[nums[i]]% 1001); //euclid algorithm d = d*q + r ; 39 = 5 * 7 + 4
        }
        // since the constraints is 1000 and we can apply euclids algo here 

        for(int i = 0 ; i < n ; i++){
            nums[i] = nums[i]/1001;
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