class Solution {

    public void conquere(int[] nums ,int s,int e, int mid){
        int i = s ;
        int j = mid+1 ;
        int[] temp = new int[(e-s)+1];
        int k = 0 ;
        while(i<=mid && j<=e){
            if(nums[i]<=nums[j]) temp[k++] = nums[i++];
            else temp[k++] = nums[j++];
        }

        while(i<=mid){
            temp[k++] = nums[i++];
        }

        while(j<=e){
            temp[k++] = nums[j++];
        }
        int originalIndex = s ;
        k = 0 ;
        for(int a : temp){
            nums[originalIndex++] = temp[k++];
        }
    }
    public void mergeSort(int[] nums,int s ,int e ){
        if(s>=e) return ;
        int mid = s+(e-s)/2 ;
        mergeSort(nums,s,mid);
        mergeSort(nums,mid+1,e);
        conquere(nums,s,e,mid);
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}