class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length == 0) return ; 
       int i = m -1 ; //first
       int j = n - 1 ; //second array
       int k = m+n-1; //end of first array
       while(j>=0){
           if(i>=0 && nums1[i] >= nums2[j]){
               int temp = nums1[k];
               nums1[k] = nums1[i];
               nums1[i] = temp ;
               k--;
               i--;
           }
           else
           {
               nums1[k--] = nums2[j--];
           }
       }
    }
}
