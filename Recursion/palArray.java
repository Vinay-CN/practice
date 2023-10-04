package Recursion;

import java.util.*;

public class palArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
       
        System.out.println(isPalindrome(arr, n));
    }

	public static boolean isPalindrome(int[] arr, int n) {
        int res = isPalindromic(arr, 0, n - 1);
        if (res == 1)
            return true;
        return false;
    }

    public static int isPalindromic(int[] arr, int begin, int end) {
		if(begin>=end) return 1;
		if(arr[begin]!=arr[end]) return 0; 
		return isPalindromic(arr,begin+1,end-1);
	
    }


	
}
