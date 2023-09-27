package Recursion;
import java.util.*;

public class Nsum {
	static long NumberSum(long N) {
        if(N==1) return 1;
		return N+NumberSum(N-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        System.out.println(NumberSum(N));
    }
}