import java.util.*;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial_recursive(n));
        sc.close();
    }

    public static long factorial_recursive(int n) {
      if(n==1) return 1;
		long t=factorial_recursive(n-1);
		return t*n;
    }
}