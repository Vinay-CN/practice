//bruteforece is 2 nested loops
//better approach is hasmap frequency 
//optimal is this
//initially count will be zero then the current element is majEle 
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0 ;
        int majorityElement  = Integer.MAX_VALUE;
        for(int num : nums){
            if(count == 0) { //if count 0 curr ele is majELe
                majorityElement = num ; 
                count++; //increase the current ele count
            }
            else if(num==majorityElement){
                count++; //if num is same as majEle then increase count
            }
            else{
                count--; //if not decrease count at last we will get highest  freq number
            }
        }
        return majorityElement ;
    }
}