package Recursion;
import java.util.*;
import java.lang.*;
import java.io.*;

public class nthevenFIb
{
        public static void main (String[] args) throws java.lang.Exception
	{
                Scanner sc=new Scanner(System.in);
                int n = sc.nextInt();
         System.out.println(evenFib(n));
        }
        static long evenFib(int n)
{
    if (n < 1)
    return n;
 
    if (n == 1)
    return 2;
 
    return ((4 * evenFib(n-1)) +
                 evenFib(n-2));
}
		
}
