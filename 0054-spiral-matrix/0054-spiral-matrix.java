class Solution { //TC 0(M*N) since we visit all the elements once space is O(m*n) since we store all the elements
    public List<Integer> doIt(int[][] mat,int i , int j , int n , int  m ,List<Integer> li) {


        for(int col = j ; col <=m ; col++){ //first row 
            li.add(mat[i][col]);
        }


        
        for(int row = i + 1 ; row <= n ; row++){ //last column

            li.add(mat[row][m]);
        }

        if(i<n){// if it is n * n [1,2,3,4,8,12,11,10,9,5,6,7,6] then it will repeat one row again to avoid we need to    check if we have any rows left or we are standing at the last row if i = 1 and n = 1 it means last row 

            for(int col = m - 1 ; col >= j ; col-- ){ //last row in reverse
               li.add(mat[n][col]);

            }
        }
        
        if(j<m){ //[7,9,6,9]if only one row pressent then it will repeat the same thing once again and same ans
            for(int row = n-1 ; row >= i + 1 ; row--){ //last row in reverse
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
        int i = 0 , j = 0 , n = matrix.length -1 , m = matrix[0].length - 1 ;
       
        while( i<=n && j<=m){
            doIt(matrix,i,j,n,m,li);
            i++;
            j++;
            n--;
            m--;
        }
        return li;

    }
}


/*class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        List<Integer> res = new ArrayList<Integer>();

        if(bottom==0) {  //if only one row just print the row and return
            for(int i=0; i<=right; i++) {
                res.add(matrix[0][i]);
            }
            return res;
        }

        if(right==0) {
            for(int i=0; i<=bottom; i++) {
                res.add(matrix[i][0]);
            }
            return res;
        }

        while(top<=bottom && left<=right) {
            
            for(int i=left; i<=right; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom) {
                for(int i=right; i>=left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right) {
                for(int i=bottom; i>=top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }

        return res;
        
    }
}*/