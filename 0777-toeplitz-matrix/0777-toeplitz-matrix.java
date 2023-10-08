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

/*class Solution {
    public static boolean check(int[][] matrix, int i, int j, int n, int m){
        int temp = matrix[i][j];
        while(i<n && j<m){
            if(matrix[i][j]!=temp){
                return false;
            }
                i++;
                j++;
        }
        return true;
    }
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<m; i++){
            if(!check(matrix,0,i,n,m)){
                return false;
            }
        }
        for(int i=1; i<n; i++){
            if(!check(matrix,i,0,n,m)){
                return false;
            }
        }
        return true;
    }
}*/