class Solution { 
    public int subarraySum(int[] nums, int k) {
       int sum = 0 ;
       HashMap<Integer ,Integer > map = new HashMap<>();
       int ans = 0;
       map.put(0,1);
       for(int num : nums){
           sum+=num;
           if(map.containsKey(sum-k)){
               ans+=map.get(sum-k);
           }
           map.put(sum,map.getOrDefault(sum,0)+1);


       }

       return ans;
    }
}