public class TicTacToe {
    private int BOARDSIZE = 3;
    private enum Status {WIN, DRAW, CONTINUE};
    private char board[][] = new char[BOARDSIZE][BOARDSIZE];
    private boolean firstPlayer;
    private boolean gameOver;
    private int moveCount = 0;

    public void play() {

    }

    private void printStatus() {

    }

    private Status gameStatus() {
        // Horizontal and Vertical Check for Win
        boolean horWin = true;
        boolean vertWin = true;
        boolean leftDiagWin = true;
        boolean rightDiagWin = true;
        for (int i = 0; i < BOARDSIZE; i++) {
            for (int j = 0; j < BOARDSIZE; j++) {
                if (board[i][0] != board[i][j]) {
                    horWin = false;
                    break;
                }

                if (board[0][i] != board[j][i]) {
                    vertWin = false;
                    break;
                }

                if (board[0][0] != board[j][j]) {
                    leftDiagWin = false;
                    break;
                }

                if (board[BOARDSIZE - 1][0] != board[BOARDSIZE - 1 - j][j]) {
                    rightDiagWin = false;
                    break;
                }

            }
            if (horWin || vertWin || leftDiagWin || rightDiagWin) {
                return Status.WIN;
            }
        }

        // Check for Draw
        if (moveCount == BOARDSIZE * BOARDSIZE) {
            return Status.DRAW;
        }

        return Status.CONTINUE;
    }

    public void printBoard() {

    }

    private void printSymbol(int col, char value) {
        
    }

    private boolean validMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            if (board[row][col] == ' ') {
                return true;
            } else {
                System.out.println("Invalid move. Cell is already occupied.");
            }
        }
        return false;
        }

}
