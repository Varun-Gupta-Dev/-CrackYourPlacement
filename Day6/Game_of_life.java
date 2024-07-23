class Solution {
    public void gameOfLife(int[][] board) {
        int n = board.length-1;
        int m = board[0].length-1;
        int newBoard[][] = new int[board.length][board[0].length];

        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                newBoard[i][j] = board[i][j];
            }
        }
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                int liveCount = 0;

                // checking horizontal neighbours
                if(j-1>=0){
                    if(newBoard[i][j-1] == 1) liveCount++;
                }
                if(j+1 <= m){
                    if(newBoard[i][j+1] == 1) liveCount++;
                }

                // Checking vertical
                if(i-1>=0){
                    if(newBoard[i-1][j] == 1) liveCount++;
                }
                if(i+1 <= n){
                    if(newBoard[i+1][j] == 1) liveCount++; 
                }

                // Cheching Diagonal
                if(i-1 >= 0 && j-1 >= 0){
                    if(newBoard[i-1][j-1] == 1) liveCount++;
                }
                if(i-1 >= 0 && j+1 <= m){
                    if(newBoard[i-1][j+1] == 1) liveCount++;
                }
                if(i+1 <= n && j-1 >= 0 ){
                    if(newBoard[i+1][j-1] == 1) liveCount++;
                }
                if(i+1 <= n && j+1 <= m){
                    if(newBoard[i+1][j+1] == 1) liveCount++;
                }

                if(liveCount < 2) board[i][j] = 0;
                if(liveCount > 3) board[i][j] = 0;
                if(liveCount == 3) board[i][j] = 1;
            }
        }
    }
}