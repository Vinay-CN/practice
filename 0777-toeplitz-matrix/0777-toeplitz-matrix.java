class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix.length - 1;
        int m = matrix[0].length-1 ;

        for(int i = 0 ; i < n ; i++){

            for(int j = m - 1 ; j >=0 ; j--){
                if(matrix[i][j] != matrix[i+1][j+1]) return false;
            }
        } 


        return true;


    }
}