class Solution {
    public void swap(int[] nums,int i , int j ){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] =t;
    }
    public int removeDuplicates(int[] nums) {
        if(nums.length==1)  return 1;
        if(nums.length==2) {
            if(nums[1]==nums[0]) return 1;
            else return 2 ;
        }
        int i = 0 , j = 1;
        while(j < nums.length){
            while(nums[i]==nums[j]&& j<nums.length-1) j++;
                if(nums[i]!=nums[j]){
                    swap(nums,i+1,j)  ;
                    i++;
                }
            
            j++;
        }
        return i+1;
    }
}




// class Solution {
//     public int removeDuplicates(int[] nums) {
//      int newIndex = 1; // Start with index 1 because the first element is already in place

//         for (int i = 0; i < nums.length - 1; i++) {

//             if (nums[i] < nums[i+1]) { // If the current element is less than the next element
            
//                 nums[newIndex] = nums[i+1]; // Move the next element to the new index
//                 newIndex++; // Increment the new index
//             }
//         }
//     return newIndex; // Return the length of the new subarray

//     }
// }