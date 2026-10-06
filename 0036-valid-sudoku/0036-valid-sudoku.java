import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> set = new HashSet<>();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                char num = board[row][col];

                if (num == '.') {
                    continue;
                }

                // Check row
                if (!set.add(num + " in row " + row)) {
                    return false;
                }

                // Check column
                if (!set.add(num + " in col " + col)) {
                    return false;
                }

                // Check 3 x 3 box
                int box = (row / 3) * 3 + (col / 3);

                if (!set.add(num + " in box " + box)) {
                    return false;
                }
            }
        }

        return true;
    }
}