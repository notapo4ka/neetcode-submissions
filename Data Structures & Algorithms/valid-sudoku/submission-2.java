class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> boxes = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];

                if (current != '.') {
                    int boxIndex = (i / 3) * 3 + (j / 3);

                    if (!boxes.add(current + " in row " + i) ||
                        !boxes.add(current + " in column " + j) ||
                        !boxes.add(current + " in box " + boxIndex)) {
                            return false;
                        }
                }
            }
        }
        return true;
    }
}
