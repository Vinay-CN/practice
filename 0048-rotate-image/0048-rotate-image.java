class Solution {
    public void rotate(int[][] matrix) {
//         //transposing matrix , if i need 
//         for(int i = 0 ; i < matrix.length ; i++){
//             for(int j = i ; j < matrix.length ; j++){
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[j][i];
//                 matrix[j][i] = temp;
//             }
//         }
//         //transpoing done now reversing each row
//         for(int row = 0 ; row < matrix.length ; row++){
//             int s = 0 , e = matrix.length-1;
//             while(s<e){
//                 int temp = matrix[row][s];
//                 matrix[row][s] = matrix[row][e];
//                 matrix[row][e] = temp;
//                 s++;
//                 e--;   
//             }
//         }
//     }
// }

//method 2 rotating algorithm
//4 way rotation
int n = matrix.length ; 
for(int i = 0 ; i < (n+1)/2 ; i++){
    for(int j = 0 ; j < n/2 ; j++){
        int temp = matrix[n-1-j][i] ; //store bottom left number
        
        matrix[n-1-j][i] = matrix[n-1-i][n-1-j]; //move bottom right element to bottom left

        matrix[n-1-i][n-1-j] = matrix[j][n-1-i] ; //move top right elelemt to bottom right 

        matrix[j][n-1-i] = matrix[i][j] ; //move top left to top right 

        matrix[i][j] = temp ; //top left is bottom left
    }
}
    }
}