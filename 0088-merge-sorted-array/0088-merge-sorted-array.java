
//bad solution 
/*class Solution {
    public void swap(int i , int j , int[] nums ){
        int temp =  nums[i] ;
        nums[i] = nums[j];
        nums[j] = temp;

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if  ( n == 0 ) return ; //if nums2 is zero then no need to do things
 
        if(m == 0 ) { //if first array is zero then copy all ele from nus2 to nums1
            int i = 0 ;
            while(i<n){
                nums1[i] = nums2[i] ;
                i++;
            } 
            return ;
        }
        int i = m-1;   //pointer at m -1
        int j = (m+n) - 1  ; //pointer at last
        int k = n -1 ; //pointer at last of nums2
        while(i>=0 && k>=0){           
            if( nums1[i] > nums2[k] ){ //nums1 > nums2 then swap i and j 
                swap( i, j, nums1 );
                i--;
                j--;
            }
            else {
                nums1[j] = nums2[k]; //else copy elemtent from k and shift to nums1
                k--;
                j--;
            }
        }
        while(j>=0 && k>=0){ //if j >= 0 && k>=0  means there are still elemnts left in nums2 copy them thats it 2 0 and 
        //  1 example i is at 2 , j is at 0 and k is at  1 and 2 > 1 so swap it and i goes beyond zero but elemts still thenre in nums2 
           nums1[j] = nums2[k];
            k--;
            j--;
        }

    }
}*/





class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        //if j in nums2 becomes less than zero means we have got our solution
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) { //replace k with i and move both
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--]; //replace k with j and move both
            }
        }
    }
}