class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(word.charAt(0)==board[r][c]){
                    boolean found = dfs(board,r,c,word,0);
                    if(found) return true;
                }
            }
        }
        return false; 
    }

    public boolean dfs(char[][] board,int r,int c, String word,int wordindex){
        //base case
        if(wordindex==word.length()){
            return true;
        }
        //out of bound cases
        int rows = board.length;
        int col = board[0].length;
        if(r<0 || c<0 || r>=rows || c>=col){
            return false;
        }

        //invalid cases
        if(board[r][c]==' ' || board[r][c] != word.charAt(wordindex)){
            return false;
        }
        //mark as visited
        char ch = board[r][c];
        board[r][c] = ' ';

        if(dfs(board, r-1, c, word, wordindex+1) ||
        dfs(board, r+1, c, word, wordindex+1)|| 
        dfs(board, r, c-1, word, wordindex+1) ||
        dfs(board, r, c+1, word, wordindex+1)){
            return true;
        }
        board[r][c] = ch;
        return false;
    }
}