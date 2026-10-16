class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<board[0].length;i++){

            HashSet<Character> colsSet = new HashSet<>();
            HashSet<Character> linesSet = new HashSet<>();

            for(int j=0;j<board[0].length;j++){

                if(colsSet.contains(board[j][i]))
                    return false;
                if(linesSet.contains(board[i][j]))
                    return false;

                if(board[j][i] != '.')
                    colsSet.add(board[j][i]);
                if(board[i][j] != '.')
                    linesSet.add(board[i][j]);
            }
            colsSet = null;
            linesSet = null;
        }

        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                int row = (i / 3) * 3 + j / 3;
                int col = (i % 3) * 3 + j % 3;

                char c = board[row][col];

                if (c != '.' && !set.add(c))
                    return false;
            }
        }

        return true;
    }
}
