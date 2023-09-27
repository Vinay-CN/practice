package Recursion;
import java.util.*;
import static java.lang.Math.ceil;

public class FIB {

	public static int fib(int n ){
       if(n==1) return 0;
		if(n==2) return 1;
		int prev1=fib(n-1);
		int prev2=fib(n-2);
		return prev1+prev2;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fib(n));
    }
}