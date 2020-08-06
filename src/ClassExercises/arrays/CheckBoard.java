package ClassExercises.arrays;

public class CheckBoard {
    public static void main(String[] args) {
        char[][] currentBoard = {{'O', 'O', 'O'}, {'X', '.', '.'}, {'.', '.', 'X'}};
        System.out.println(checkBoard(currentBoard));
    }

    public static char checkBoard(char[][] board) {
        if (board == null) {
            return '.';
        }

        /* Check Diagonals */
        if (board[0][0] != '.' || board[0][2] != '.') {
            if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
                return board[0][0];
            } else if (board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
                return board[0][2];
            }
        }

        /* Check Horizontal + Vertical Patterns */
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
