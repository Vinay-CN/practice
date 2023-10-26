class Solution {
    public void swap(int[] nums , int i , int j){
        int temp = nums[i] ;
        nums[i] = nums[j] ;
        nums[j] = temp;
    }
    public void perm(int[] nums , List<List<Integer>> li , int cid){
        if(cid == nums.length ){
            List<Integer> currPerm = new ArrayList<>();
            for(int num : nums){
                currPerm.add( num );
            } 
            li.add(currPerm);
        }
        for(int i = cid ; i < nums.length ; i++){
            swap(nums,i,cid);
            perm(nums,li,cid+1);
            swap(nums,i,cid);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        perm(nums,li,0);
        return li;
    }
}