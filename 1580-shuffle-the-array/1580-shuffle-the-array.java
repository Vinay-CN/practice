class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] temp = new int[n];
        int max = 10000; //any number greater than 10 ^ 3 
        for(int i =0 ; i < n ; i++){
            temp[i] = nums[i] + nums[n+i] * max; //pairing
        }
        int ind = 0 ;
        for(int num : temp){
            nums[ind] =num%max  ; //to get first value
            ind++;
            nums[ind] = num/max ; //to get second value
            ind++;
        }
        return nums;

    }
}