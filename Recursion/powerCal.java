import java.util.*;

class powerCal {
	public static long xPowerN(int x, int n){
		if(n==1) return x;
		return x*xPowerN(x,n-1);

		
	}
	public static void main(String[] args)
	{
    		Scanner sc = new Scanner(System.in);
    		int x = sc.nextInt();
    		int n = sc.nextInt();
		System.out.println(xPowerN(x, n));
	}
}

//optimized

// import java.io.*;
// import java.util.*;

// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//        int X,N;
//         X = sc.nextInt();        
//         N = sc.nextInt();

//         System.out.println(power(X,N));		
//     }

// 	public static long power(int p, int q)
//     {
// 		//Write code here
// 		if(q==0) return 1;
// 		long t=power(p,q/2);  because 2^n = 2^ n/2 * 2 ^ n/2 if odd means 0.5 and 0.5 will be missed so we will multiply p one times
// 		if(q%2==1)
// 		{
// 			//odd
// 			return t*t*p;   //just do it yourself
// 		}
// 		else
// 		{
// 			//even
// 			return t*t;
// 		}
		
//     }
// }


