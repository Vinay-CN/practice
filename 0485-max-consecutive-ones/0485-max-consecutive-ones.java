class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0 ;
        int i = 0 , j = 0 ;
        while(j<nums.length){
            if(nums[j]==1){
                max = Math.max(max,(j-i)+1);
                j++;
            }
            else
            {
                j++;
                i=j;
            }
        }
        return max;
    }
}

// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int count =0;
//         int max = 0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i] == 1){
//                 count++;
//             }else{
//                 max = Math.max(max, count);
//                 count=0;
//             }
//         }
//         max = Math.max(max, count);
//         return max;
//     }
// }