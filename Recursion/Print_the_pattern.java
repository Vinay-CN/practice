package Recursion;

    import java.io.*;
import java.util.*;
public class Print_the_pattern {



	public static void solve(int n)
    {
     if(n==0) return ;
		solve(n-1);
	 for(int i = 1 ; i <= n ;i++){
		 System.out.print("* ");
	 }
		System.out.println();
		
    }
	
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
		solve(n);

    }
}
