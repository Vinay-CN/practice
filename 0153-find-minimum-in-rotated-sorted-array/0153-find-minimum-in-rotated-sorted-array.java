class Solution {
    public int findMin(int[] nums) {
      int start=0;
      int end=nums.length-1;
      int possibleAns=nums[0];
      while(start<=end)
      {
          int mid=(start+end)/2;
          if(mid+1<nums.length && nums[mid]>nums[mid+1])
          {
              possibleAns=nums[mid+1];
              start=mid+1;
          }
          if(nums[start]<=nums[mid])
          {
              start=mid+1;
          }
          else
          {
              end=mid-1;
          }
      }
     return possibleAns;

    }
}