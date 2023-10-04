package Recursion;

import java.util.*;

class Solution {
    public int recforMin(int[] arr, int n) {
		// if(n==1)
		// 	return arr[0];
		// return Math.min(arr[n-1],recforMin(arr,n-1));


		//or
		if(n==0) return arr[0];
		int min = recforMin(arr,n-1);
		int ans = Integer.MAX_VALUE;
		if(arr[n-1]<ans  && arr[n-1]<min){
			 ans = arr[n-1];
		}
		else{
			ans = min ;
		}
		return ans;
    }
}

public class minOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        Solution solution = new Solution();
        System.out.println(solution.recforMin(arr, n));
    }
}
