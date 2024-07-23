class Solution {

    public boolean search(char board[][], String word, boolean visited[][], int i, int j, int idx){

        // Base case
        if(idx == word.length()) return true;

        if(i<0 || j<0 || i>board.length-1 || j>board[0].length-1 || visited[i][j] || board[i][j] != word.charAt(idx) ){
            return false;
        }

        visited[i][j] = true;
        if(search(board, word,visited, i+1, j, idx+1) || search(board, word,visited, i, j-1, idx+1) || 
            search(board, word,visited, i-1, j, idx+1) || search(board, word,visited, i, j+1, idx+1)){
                return true;
            }

            // Backtracking step
            visited[i][j] = false;
            return false;
    }
    
    public boolean exist(char[][] board, String word) {

        boolean visited[][] = new boolean[board.length][board[0].length];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    if(search(board,word,visited,i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}