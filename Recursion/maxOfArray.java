package Recursion;

import java.io.*;
import java.util.Scanner;

public class maxOfArray {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
        int result=maxElement(nums,0);
        System.out.print(result);
    }

    public static int maxElement(int[] arr,int i){
	  if(i==arr.length) return  Integer.MIN_VALUE;
	  int smallAns = maxElement(arr,i+1);
	  int ans=Integer.MIN_VALUE;
		if(arr[i]>ans && arr[i] > smallAns) ans = arr[i];
		else ans = smallAns;

		return  ans ;
    }
}




import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
        int result=maxElement(nums,0);
        System.out.print(result);
    }

    public static int maxElement(int[] arr,int idx){
  //     if(n==1) return arr[0];
		// int t=maxElement(arr,n-1);
	 //  return Math.max((arr[n-1]),t);
		if(idx==arr.length) return 0;
		int smallans=maxElement(arr,idx+1);//smallans = max of previous function
		int ans=Math.max(smallans,arr[idx]);//it will give max of small and current index;
		return ans;
    }
}