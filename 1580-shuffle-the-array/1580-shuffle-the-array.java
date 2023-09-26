class Solution {
    public int[] shuffle(int[] nums, int n) {
        for(int i = n ; i < nums.length ; i++){
            nums[i] = (nums[i] << 10 ) | nums[i-n]; // left shift and to pair do or operation  i 
        } // left shifting 10 times because 1000 is max number and 1000 has 10 bits so move 10 bits
        int index = 0 ;
        for(int i = n ; i < nums.length ; i++ , index+=2){
            nums[index] = nums[i] & 1023 ;  //to get the paired number do and op with all one 
            nums[index+1] = nums[i]>>10;  // do right shift to get original number
        }

        return nums;
    }
}



//pairing the array
// class Solution {
//     public int[] shuffle(int[] nums, int n) {
//         int j = n;
//         for(int i = 0 ; i < n ; i++){
//             nums[j] = nums[i]*1001 + nums[j]; // since the constraints is 1000 and we can apply euclids algo here 
//             j++;
//         }

//         j = n ;
//         for(int i = 0 ; i < 2 * n ; i+=2){
//             nums[i] = nums[j]/1001 ;
//             nums[i+1] = nums[j]%1001;
//             j++;
//         }

//         return nums;
//     }
// }


// class Solution {
//     public int[] shuffle(int[] nums, int n) {
//         int ans[] = new int[2*n];
//         int j = 0 ; 
//         for(int i = 0 ; i < 2*n ; i = i + 2){
//                 ans[i] = nums[j];
//                 ans[i+1] = nums[j+n] ;
//                 j++;
//         }
//         return ans;
//     }
// }

