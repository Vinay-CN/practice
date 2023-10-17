class Solution {
    public void rotate(int[][] matrix) {
        //transposing matrix , if i need 
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = i ; j < matrix.length ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //transpoing done now reversing each row
        for(int row = 0 ; row < matrix.length ; row++){
            int s = 0 , e = matrix.length-1;
            while(s<e){
                int temp = matrix[row][s];
                matrix[row][s] = matrix[row][e];
                matrix[row][e] = temp;
                s++;
                e--;   
            }
        }
    }
}

