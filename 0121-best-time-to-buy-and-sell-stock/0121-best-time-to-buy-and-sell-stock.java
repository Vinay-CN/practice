class Solution {
    public int maxProfit(int[] nums) {
        if(nums.length == 1) return  0 ;
        int dayOfBuy = 0;
        int dayOfSell = 0;
        int profit = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < nums[dayOfBuy] ){  //if current num is less than previousdays num then i will buy on this day
                dayOfBuy = i ;
            }
           if(i > dayOfBuy && nums[i] - nums[dayOfBuy] >= profit){
                dayOfSell = i; //if i > previous sell date 
                profit = Math.max(profit,nums[dayOfSell] - nums[dayOfBuy]);
            }
        }

        return profit ;

    }
}