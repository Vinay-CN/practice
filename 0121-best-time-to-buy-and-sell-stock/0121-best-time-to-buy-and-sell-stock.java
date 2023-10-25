class Solution {
    public int maxProfit(int[] nums) {
        if(nums.length == 1) return  0 ;
        int dayOfBuy = 0;
        int dayOfSell = 0;
        int profit = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]<=nums[dayOfBuy] ){
                dayOfBuy = i ;
            }
           if(i > dayOfSell && nums[i] - nums[dayOfBuy] >= profit){
                dayOfSell = i;
                profit = Math.max(profit,nums[dayOfSell] - nums[dayOfBuy]);
            }
        }

        return profit ;

    }
}