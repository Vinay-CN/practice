class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map =new HashMap<>();
        for(int i = 0;i< nums.length ;i++)
        {
          int curr=nums[i];
          int x=target - curr ;
          if(map.containsKey(x))
          {
            return new int[] {map.get(x),i};
          }
            map.put(curr,i);
        }
        return null;
    }
}
//https://leetcode.com/problems/two-sum/solutions/3619262/3-method-s-c-java-python-beginner-friendly/