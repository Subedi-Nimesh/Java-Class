package assignment.tictactoe;

public class Board {
    private final int[][] board;
    private int count = 0;

    public Board() {
        board = new int[3][3];
    }

    private int validate(int col, int row) {
        if(board[row][col] == 0) {
            return 0;
        }

        return -1;
    }

    public int dropChip(int col, int row, int playerNumber) {

        int valid = validate(col, row);
        if(valid != -1) {
            board[row][col] = playerNumber;
            count++;
        }
        return valid;
    }

    private int checkVertical(int row, int col, int playerNumber) {
        int downResult = checkDown( row, col, playerNumber);
        int upResult = checkUp( row, col, playerNumber);
        return downResult + upResult;
    }

    private int checkDown(int row, int col, int playerNumber) {
        int check = 0;
        for(int i = 0; i < 3; i++) {
            if(row + i > 2) {
                break;
            }
            if (board[row + i][col] == playerNumber) {
                check++;
            }
            else {
                break;
            }
        }
        return check;
    }

    private int checkUp(int row, int col, int playerNumber) {
        int check = 0;
        for(int i = 0; i < 3; i++) {

            if(row - i < 0) {
                break;
            }
            if (board[row - i][col] == playerNumber) {
                check++;
            }
            else {
                break;
            }
        }
        return check;
    }

    private int checkHorizontal(int row, int col, int playerNumber) {
        int leftResult = checkLeft( row, col, playerNumber);
        int rightResult = checkRight( row, col, playerNumber);
        return leftResult + rightResult;
    }

    private int checkLeft(int row, int col, int playerNumber) {
        int check = 0;
        for(int i = 0; i < 3; i++) {
            if(col - i < 0) {
                break;
            }
            if (board[row][col - i] == playerNumber) {
                check++;
            }
            else {
                break;
            }
        }
        return check;
    }

    private int checkRight(int row, int col, int playerNumber) {
        int check = 0;
        for(int i = 0; i < 3; i++) {
            if(col + i > 2) {
                break;
            }
            if (board[row][col + i] == playerNumber) {
                check++;
            }
            else {
                break;
            }
        }
        return check;
    }

    private int checkDownLeftToUpRight(int row, int col, int playerNumber) {
        int downLeftResult = checkDownLeft( row, col, playerNumber);
        int upRightResult = checkUpRight( row, col, playerNumber);
        return downLeftResult + upRightResult;
    }

    private int checkDownLeft(int row, int col, int playerNumber) {
        int check = 0;
        for(int i = 0; i < 3; i++) {
            if(row + i > 2  || col - i < 0) {
                break;
            }
            if (board[row + i][col - i] == playerNumber) {
                check++;
            }
            else {
                break;
            }
        }
        return check;
    }

    private int checkUpRight(int row, int col, int playerNumber) {
        int check = 0;
        for(int i = 0; i < 3; i++) {
            if(row - i < 0 || col + i > 2) {
                break;
            }
            if (board[row - i][col + i] == playerNumber) {
                check++;
            }
            else {
                break;
            }
        }
        return check;
    }

    private int checkUpLeftToDownRight(int row, int col, int playerNumber) {
        int upLeftResult = checkUpLeft( row, col, playerNumber);
        int downRightResult = checkDownRight( row, col, playerNumber);
        return upLeftResult + downRightResult;
    }

    private int checkUpLeft(int row, int col, int playerNumber) {
        int check = 0;
        for(int i = 0; i < 3; i++) {
            if(row - i < 0 || col - i < 0) {
                break;
            }
            if (board[row - i][col - i] == playerNumber) {
                check++;
            }
            else {
                break;
            }
        }
        return check;
    }

    private int checkDownRight(int row, int col, int playerNumber) {
        int check = 0;
        for(int i = 0; i < 3; i++) {
            if(row + i > 2 || col + i > 2) {
                break;
            }
            if (board[row + i][col + i] == playerNumber) {
                check++;
            }
            else {
                break;
            }
        }
        return check ;
    }

    public int getWinner(int row, int col, int playerNumber) {
        if (checkVertical(row, col, playerNumber) > 3 || checkHorizontal(row, col, playerNumber) > 3 || checkDownLeftToUpRight(row, col, playerNumber) > 3 || checkUpLeftToDownRight(row, col, playerNumber) > 3) {
            return playerNumber;
        }
        else if(count == 9) {
            return 3;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {

        StringBuilder print = new StringBuilder();
        for(int row = 0; row < board.length; row++) {
            print.append("\n").append(row + 1).append(" |");
            for(int col = 0; col < board[0].length; col++) {
                if(board[row][col] == 1) {
                    print.append("X|");
                }
                else if(board[row][col] == 2) {
                    print.append("0|");
                }
                else {
                    print.append("_|");
                }
            }
        }
        print.append("\n   1 2 3");
        return print.toString();
    }
}