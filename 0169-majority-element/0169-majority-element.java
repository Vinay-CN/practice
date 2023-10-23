class Solution {
    public int majorityElement(int[] nums) {
        int count = 0 ;
        int majorityElement  = Integer.MAX_VALUE;
        for(int num : nums){
            if(count == 0) {
                majorityElement = num ;
                count++;
            }
            else if(num==majorityElement){
                count++;
            }
            else{
                count--;
            }
        }
        return majorityElement ;
    }
}