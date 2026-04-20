class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean result = true;

        for (int i = 0; i < board.length; i++) {
            Set<Character> row = new HashSet<>();

            for (int j = 0; j < board[i].length; j++) {
                if (Character.isDigit(board[i][j])) {
                    if (row.add(board[i][j])) {
                        result = true;
                    } else {
                        return false;
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            Set<Character> column = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                if (Character.isDigit(board[j][i])) {
                    if (column.add(board[j][i])) {
                        result = true;
                    } else {
                        return false;
                    }
                }
            }
        }

        for (int rowOffset = 0; rowOffset < 9; rowOffset += 3) {
            for (int colOffset = 0; colOffset < 9; colOffset += 3) {
                Set<Character> box = new HashSet<>();

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char current = board[rowOffset + i][colOffset + j];

                        if (current != '.') {
                            if (!box.add(current)) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        
        return result;
    }
}
