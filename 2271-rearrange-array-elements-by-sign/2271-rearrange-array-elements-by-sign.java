class Solution {
    //using 1 pass and O(N) space
    //we know that every odd index will have neg value so if we find neg we will put in ans and increase index by 2
    //if even means we will put in even index
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int posIndex = 0, negIndex = 1;
        for (int i = 0; i < n; i++) {

            // Fill negative elements in odd indices and inc by 2.
            if (nums[i] < 0) {
                ans[negIndex] =  nums[i];
                negIndex += 2;
            }

            // Fill positive elements in even indices and inc by 2.
            else {
                ans[posIndex] =  nums[i];
                posIndex += 2;
            }
        }

        return ans;
    }
}

//using two pass and O(N) sPAce
// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int n = nums.length ;

//        int[] pos = new int[n/2];
//        int[] neg = new int[n/2]; 
//         int posI = 0;
//         int negI = 0 ;
//        for(int i = 0 ; i < n ; i++){
//            if(nums[i]<0) {
//                neg[negI++] = nums[i];
//            }
//            else{
//                pos[posI++] = nums[i];
//            }
//        }
//         posI = 0;
//         negI = 0 ;
//        for(int i = 0 ; i < n/2 ; i++){
//            nums[2*i] = pos[posI++];
//            nums[2*i+1] = neg[negI++] ; 
//        }

//        return nums;
//     }
// }
