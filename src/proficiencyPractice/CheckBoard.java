package proficiencyPractice;

public class CheckBoard {
    public static void main(String[] args) {
        char[][] currentBoard = {{'O', 'O', 'O'}, {'X', '.', '.'}, {'.', '.', 'X'}};
        System.out.println(checkBoard(currentBoard));
    }

    public static char checkBoard(char[][] board) {
        /* Verify Null Input */
        if (board == null) {
            return '.';
        }

        /* Check Horizontal + Vertical Patterns, but no diagonals*/
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                    return board[i][0];
                }
                if (board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                    return board[i][j];
                }
            }
        }
        return '.';
    }
}
