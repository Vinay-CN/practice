class Solution { 
    public int subarraySum(int[] nums, int k) {
       int sum = 0 ;
       HashMap<Integer ,Integer > map = new HashMap<>();
       int ans = 0;
       map.put(0,1); // frequnecy of zero is 1
       for(int num : nums){
           sum+=num;
           if(map.containsKey(sum-k)){   //if map coontains sum - k then add that frequnecy to the ans
               ans+=map.get(sum-k);
           }
           map.put(sum,map.getOrDefault(sum,0)+1); //put current sum to the map

       }

       return ans;
    }
}