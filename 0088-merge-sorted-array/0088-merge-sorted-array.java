class Solution {
    public void swap(int i , int j , int[] nums ){
        int temp =  nums[i] ;
        nums[i] = nums[j];
        nums[j] = temp;

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if  ( n == 0 ) return ;
 
        if(m == 0 ) {
            int i = 0 ;
            while(i<n){
                nums1[i] = nums2[i] ;
                i++;
            } 
            return ;
        }
        int i = m-1; 
        int j = (m+n) - 1  ;
        int k = n -1 ;
        while(i>=0 && k>=0){
            if( nums1[i] > nums2[k] ){
                swap( i, j, nums1 );
                i--;
                j--;
            }
            else {
                nums1[j] = nums2[k];
                k--;
                j--;
            }
        }
        while(j>=0 && k>=0){
            nums1[j] = nums2[k];
            k--;
            j--;
        }

    }
}