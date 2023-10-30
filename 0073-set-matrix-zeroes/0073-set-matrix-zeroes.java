class Solution {
    public void setZeroes(int[][] matrix) {
    int col0 = 1, rows = matrix.length, cols = matrix[0].length;

    for (int i = 0; i < rows; i++) {
        if (matrix[i][0] == 0) col0 = 0;
        for (int j = 1; j < cols; j++)
            if (matrix[i][j] == 0)
                matrix[i][0] = matrix[0][j] = 0;
    }

    for (int i = rows - 1; i >= 0; i--) {
        for (int j = cols - 1; j >= 1; j--){
                 if (matrix[i][0] == 0 || matrix[0][j] == 0)
                matrix[i][j] = 0;
        }
           
        if (col0 == 0) matrix[i][0] = 0;
    }
}   }
  /*  //brute force is making non zeros as   -1 
//better is using one extra row array and col array
//better approach
class Solution {
    public void setZeroes(int[][] matrix) {
        //instead of extra row and column matrix we are utilizing first row and column as our extra array
         int n = matrix.length ;
         int m = matrix[0].length ;
//         int[] row = new int[n]; ----> matrix[0][j] this for first row
//         int[] col = new int[m]; -----> matrix[i][0]  this for first column

        int col = 1;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(matrix[i][j] == 0 ){
                    if(j!=0){
                        matrix[0][j]=0;
                        matrix[i][0]=0;
                    }
                    else col = 0 ;
                    
                }
            }
        }                                                                                                                                                                                                                                                                                                                                       
        for(int i = 1 ; i < n ; i++){
            for(int j = 1 ; j < m; j++){
                if(matrix[0][j]==0 || matrix[i][0]==0 ){
                    matrix[i][j]=0;
                }
            }
        }
        //mark the 1st col & then 1st row:
        if(matrix[0][0]==0) {
     
                    for (int j = 0; j < m; j++) {
                matrix[0][j]=0;
            }
        }
        
        if(col==0){
            for(int i = 0 ; i < n ;i++){
                matrix[i][0]=0;
            }
        }
       


    }
}




// class Solution {

//     //better approach with some extra space 
//     public void setZeroes(int[][] matrix) {
//         int n = matrix.length ;
//         int m = matrix[0].length ;

//         int[] row = new int[n];
//         int[] col = new int[m];

//         for(int i = 0 ; i < n ; i++){
//             for(int j = 0 ; j < m ; j++){
//                 if(matrix[i][j]==0){
//                     row[i] = 1;
//                     col[j] = 1;
//                 }
//             }
//         }


//         for(int i = 0 ; i < n ; i++){
//             for(int j = 0 ; j < m ; j++){
//                 if(row[i]==1||col[j]==1){
//                     matrix[i][j]=0;
//                 }
//             }
//         }

//     }
// }


//brute force approach without using extra space 
class Solution {
public void  setZero(int i , int j , int[][] matrix){
        for(int k=0;k<matrix[0].length;k++){
            if(matrix[i][k]!=0) {
                matrix[i][k]=-1;
            }
        }
        for(int k = 0 ; k < matrix.length ;k++){
            if(matrix[k][j]!=0){
                matrix[k][j]=-1;
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length;j++){
                if(matrix[i][j]==0) {
                    setZero(i,j,matrix);
                }
            }
        }
 
            for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length;j++){
                if(matrix[i][j]==-1) {
                    matrix[i][j]=0;
                }
            }
        }

}
}
*/