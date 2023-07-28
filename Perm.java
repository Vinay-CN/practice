import java.util.*;

class Solution {

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void printComb(int[] arr, int cid) {

        if (cid == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = cid; i < arr.length; i++) {
            swap(arr, i, cid);
            printComb(arr, cid + 1);
            swap(arr, i, cid);
        }

    }

    public void printPermutations(int[] arr) {
        printComb(arr, 0);
    }
}

public class Perm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Solution s1 = new Solution();

        s1.printPermutations(arr);

    }
}
