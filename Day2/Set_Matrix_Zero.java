package Day2;

class Solution {
    public static void setRowZero(int row, int matrix[][]){
        int col=0;
        while(col<matrix[0].length){
            matrix[row][col] = 0;
            col++;
        }
    }

    public static void setColZero(int col, int matrix[][]){
        int row=0;
        while(row<matrix.length){
            matrix[row][col]=0;
            row++;
        }
    }
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length; 
            // TC = O(m*n)
        // HashSet<Integer> rowList = new HashSet<>();
        // HashSet<Integer> colList = new HashSet<>();
        
        // Boolean change = false;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(matrix[i][j]==0){
        //             rowList.add(i);
        //             colList.add(j);
        //         }
        //     }
        // }
        // for(int row: rowList){
        //     setRowZero(row,matrix);
        // }
        // for(int col: colList){
        //     setColZero(col,matrix);
        // }

       // Another method 
        Boolean isZero[][] = new Boolean[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==0) isZero[i][j] = true;
                else isZero[i][j] = false;
                
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(isZero[i][j]){
                    setRowZero(i,matrix);
                    setColZero(j,matrix);
                }
            }
        }
    }
}