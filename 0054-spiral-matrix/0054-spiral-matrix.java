import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> doIt(int[][] mat, int i, int j, int n, int m, List<Integer> li) {
        for (int col = j; col <= m; col++) {
            li.add(mat[i][col]);
        }

        for (int row = i + 1; row <= n; row++) {
            li.add(mat[row][m]);
        }

        if (i < n) {
            for (int col = m - 1; col >= j; col--) {
                li.add(mat[n][col]);
            }
        }

        if (j < m) {
            for (int row = n - 1; row > i; row--) {
                li.add(mat[row][j]);
            }
        }

        return li;
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li = new LinkedList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return li;
        }
        int i = 0, j = 0, n = matrix.length - 1, m = matrix[0].length - 1;

        while (i <= n && j <= m) {
            doIt(matrix, i, j, n, m, li);
            i++;
            j++;
            n--;
            m--;
        }
        return li;
    }
}


// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {
//         List<Integer> result = new ArrayList<>();
//         if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
//             return result;
//         }

//         int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;

//         while (top <= bottom && left <= right) {
//             // Traverse from left to right
//             for (int i = left; i <= right; i++) {
//                 result.add(matrix[top][i]);
//             }
//             top++;

//             // Traverse from top to bottom
//             for (int i = top; i <= bottom; i++) {
//                 result.add(matrix[i][right]);
//             }
//             right--;

//             // Ensure there are more rows to traverse
//             if (top <= bottom) {
//                 // Traverse from right to left
//                 for (int i = right; i >= left; i--) {
//                     result.add(matrix[bottom][i]);
//                 }
//                 bottom--;
//             }

//             // Ensure there are more columns to traverse
//             if (left <= right) {
//                 // Traverse from bottom to top
//                 for (int i = bottom; i >= top; i--) {
//                     result.add(matrix[i][left]);
//                 }
//                 left++;
//             }
//         }

//         return result;
//     }
// }
