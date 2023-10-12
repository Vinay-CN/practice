class Solution {
    public void conquere(int[] arr,int si,int li,int mid)
    {
       int[] temp=new int[(li-si)+1];
       int i=si;
       int j=mid+1;
       int k=0;
       while(i<=mid &&j<=li)
       {
           if(arr[i]<=arr[j])
           {
               temp[k++]=arr[i++];
           }
           else
           {
               temp[k++]=arr[j++];
           }
       }
       while(i<=mid)
       {
          temp[k++]=arr[i++];  
       } 
       while(j<=li)
       {
           temp[k++]=arr[j++];
       } 
       k=0;
       int r=si;
       while(k<temp.length)
       {
           arr[r++]=temp[k++];
       }
    }
    public void mergeSort(int[] arr,int si,int li)
    {
        if(si>=li)
        {
           return;
        }
        int mid=si+(li-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,li);
        conquere(arr,si,li,mid);
    }
    public int[] sortArray(int[] nums) {
       mergeSort(nums,0,nums.length-1);
       return nums; 
    }
}