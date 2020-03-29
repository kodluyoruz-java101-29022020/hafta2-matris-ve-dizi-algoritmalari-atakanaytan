package firstQuestion;

public class GameOfLife {

    int[][] directions = {
            {0, 1},
            {0, -1},
            {1, 0},
            {-1, 0},
            {-1, -1},
            {-1, 1},
            {1, -1},
            {1, 1}
    };

    public void gameOfLife(int[][] board) {

        int rows = board.length;
        int columns = board[0].length;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                if (board[i][j] == 1) {
                    int lives = countLives(board, i, j);

                    if (lives < 2 || lives > 3) {
                        board[i][j] = 2;
                    }
                }
                    else if (board[i][j] == 0) {
                        int lives = countLives(board, i, j);
                        if (lives == 3) {
                            board[i][j] = -1;
                        }
                    }
                }
            }
        updateBoard(board);
    }


    public int countLives(int[][] board, int i, int j) {

        int result = 0;

        for (int[] direction : directions) {

            int newRow = i + direction[0];
            int newColumn = j + direction[1];

            if (newRow >= 0
                    && newRow < board.length
                    && newColumn >= 0
                    && newColumn < board[0].length
                    && (board[newRow][newColumn] == 1 || board[newRow][newColumn] == 2)) {

                result++;
            }
        }
        return result;
    }

    private void updateBoard(int[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == -1) {
                    board[i][j] = 1;
                } else if (board[i][j] == 2) {
                    board[i][j] = 0;
                }
            }
        }
    }

}
