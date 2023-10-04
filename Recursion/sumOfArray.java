import java.util.*;

public class sumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(sumofArrayRec(arr, n));
    }

	public static int sumofArrayRec(int[] arr, int n) {
        if(n<=0) return 0;
		return arr[n-1]+sumofArrayRec(arr,n-1);
    }
}