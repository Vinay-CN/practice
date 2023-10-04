package Recursion ;


import java.util.*;
class lastOccur {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = s.nextInt();
		}
		int T = s.nextInt();
		System.out.println(lastIndex(A, T, N-1));
	}

	static int lastIndex(int A[],int T,int startIndex)
	{
		if(startIndex<0) return -1;
		if(A[startIndex]==T) return startIndex;
		else return lastIndex(A,T,startIndex-1);
		
       
	}
}



// import java.util.Scanner;
// class Main {
// 	public static void main(String[] args) {
// 		Scanner s = new Scanner(System.in);
//         int N = s.nextInt();
// 		int[] A = new int[N];
// 		for(int i = 0; i < N; i++){
// 			A[i] = s.nextInt();
// 		}
// 		int T = s.nextInt();
// 		System.out.println(lastIndex(A, 0,T));
// 	}

// 	//if they give 0 as start index 
// 	static int lastIndex(int A[],int idx,int tar)
// 	{
// 		if(idx==A.length)
// 		{
// 			return -1;
// 		}
// 		int smallans=lastIndex(A,idx+1,tar);
// 		int ans=0;
// 		if(smallans==-1){


// 			if(A[idx]==tar)
// 			{
// 				ans=idx;
// 			}
// 			else
// 			{
// 				ans=smallans;
// 			}

			
// 		}
			
	
// 		return ans;
//     }
// }
