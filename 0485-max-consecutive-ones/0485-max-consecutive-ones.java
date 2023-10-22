class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    //   int max = 0;
    //   int i = 0 ; 
    //   int j = 0 ;
    //   while(j<nums.length){
    //       if(nums[j]!=1){
    //           max =Math.max(max , j - i);
    //           i = j + 1 ;
    //       }
    //       j++;
    //   }
    //   if(nums[nums.length-1]==1){
    //        max =Math.max(max , j - i );
    //   }
    //   return max   ;


      int count = 0 ;
     int maxCount=0;
     for(int i=0;i<nums.length;i++) 
     {
         if(nums[i]==1)
         {
             count++;
         }
         else
         {
             count=0;
         }
         if(count>maxCount)
         {
             maxCount=count;
         }
     }  
    return maxCount;
    }
}