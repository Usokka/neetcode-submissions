class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<board[0].length;i++){

            HashSet<Character> colsSet = new HashSet<>();
            HashSet<Character> linesSet = new HashSet<>();
            HashSet<Character> squareSet = new HashSet<>();

            for(int j=0;j<board[0].length;j++){

                if(board[j][i] != '.' && !colsSet.add(board[j][i]))
                    return false;
                if(board[i][j] != '.' && !linesSet.add(board[i][j]))
                    return false;
                
                int row = (i / 3) * 3 + j / 3;
                int col = (i % 3) * 3 + j % 3;

                if (board[row][col] != '.' && !squareSet.add(board[row][col]))
                    return false;
            }
            colsSet = null;
            squareSet = null;
            linesSet = null;
        }

        return true;
    }
}
