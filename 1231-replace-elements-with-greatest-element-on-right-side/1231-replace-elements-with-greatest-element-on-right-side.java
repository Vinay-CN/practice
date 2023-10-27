class Solution {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1];
        arr[arr.length-1] = -1;
        for(int i = arr.length -2 ; i>=0 ; i--){
                int temp = max;
                if(arr[i]>max){
                    max = arr[i];
                    arr[i] = -1;
                }
                arr[i] = temp ; 
        }
        return arr;
    }
}