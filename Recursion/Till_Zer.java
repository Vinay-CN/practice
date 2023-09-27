package Recursion;
import java.util.*;
public class Till_Zer {

	public static void printtillN(int N) {
	   if(N==0) return ;
		System.out.print(N+" ");
		printtillN(N-1);
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        printtillN(N);
        sc.close();
    }
}