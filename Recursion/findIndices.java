package Recursion;

// import java.io.*;
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n,x;
//         n = sc.nextInt();
//         x = sc.nextInt();
//         int arr1[] = new int[n];
//         for(int i=0;i<n;i++)
//             arr1[i] = sc.nextInt();
//         findX(arr1, n, x);
//     }



//     static void findX(int arr[], int n, int x)
//     {
//        if(n==0) return;
// 		findX(arr,n-1,x);
// 		if(arr[n-1]==x) System.out.print(n-1+" ");
      
//     }
// }

//6 jan rec on array
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,x;
        n = sc.nextInt();
        x = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
		int count=0; //to create a array in fuction;
        int [] ans=findX(arr1, 0/*index*/, x,count);
		for(int i=0;i<ans.length;i++)
			{
				System.out.print(ans[i]+" ");
			}
    }
	public static int[] findX(int []arr,int idx,int x,int count)
	{
		if(idx==arr.length)
		{
			int[] ba=new int[count]; //here i will have how many times tar repeated so i will create array size
			return ba; //retrun address catched by ans
		}
		int[] ans;
		if(arr[idx]==x)
		{
			ans=findX(arr,idx+1,x,count+1);//to creat the array of target numbers size in ba
		}
		else
		{
			ans=findX(arr,idx+1,x,count);
		}
		if(arr[idx]==x) //returning back from rec call
		{
			ans[count]=idx;//index value will be placed at count value;
		}
		return ans;
	}



  //   static void findX(int arr[], int n, int x)
  //   {
  //       if(n==0) return;
		//  findX(arr,n-1,x);
		// if(arr[n-1]==x)
		// {
		// 	System.out.print(n-1+" ");
		// }
		
      
  //   }
	
}
