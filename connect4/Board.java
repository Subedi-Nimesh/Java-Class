package assignment.connect4;

import java.util.Arrays;

public class Board
{
    private int[][] board;
    private boolean winner;
    private int count = 0;

    public Board()
    {
        board = new int[6][7];
    }

    private int validateRow(int col)
    {
        for(int row = board.length - 1; row > -1; row--)
        {
            if(board[row][col] == 0)
            {
                return row;
            }
        }
        return -1;
    }

    public int dropChip(int col, int playerNumber)
    {
        int row = validateRow(col);
        if(row != -1)
        {
            board[row][col] = playerNumber;
            count++;
        }
        return row;
    }

    private int checkDown(int row, int col, int playerNumber)
    {
        int check = 0;
        for(int i = 0; i < 4; i++)
        {
            if(row <= 2)
            {
                if (board[row + i][col] == playerNumber)
                {
                    check++;
                }
                else
                {
                    break;
                }
            }
        }
        return check;
    }

    private int checkHorizontal(int row, int col, int playerNumber)
    {
        int leftResult = checkLeft( row, col, playerNumber);
        int rightResult = checkRight( row, col, playerNumber);
        int total = leftResult + rightResult;
        return total;
    }

    private int checkLeft(int row, int col, int playerNumber)
    {
        int check = 0;
        for(int i = 0; i < 4; i++)
        {
            if(col - i < 0)
            {
                break;
            }
            if (board[row][col - i] == playerNumber)
            {
                check++;
            }
            else
            {
                break;
            }
        }
        return check;
    }

    private int checkRight(int row, int col, int playerNumber)
    {
        int check = 0;
        for(int i = 0; i < 4; i++)
        {
            if(col + i > 6)
            {
                break;
            }
            if (board[row][col + i] == playerNumber)
            {
                check++;
            }
            else
            {
                break;
            }
        }
        return check;
    }

    private int checkDownLeftToUpRight(int row, int col, int playerNumber)
    {
        int downLeftResult = checkDownLeft( row, col, playerNumber);
        int upRightResult = checkUpRight( row, col, playerNumber);
        int total = downLeftResult + upRightResult;
        return total;
    }

    private int checkDownLeft(int row, int col, int playerNumber)
    {
        int check = 0;
        for(int i = 0; i < 4; i++)
        {
            if(row + i > 5  || col - i < 0)
            {
                break;
            }
            if (board[row + i][col - i] == playerNumber)
            {
                check++;
            }
            else
            {
                break;
            }
        }
        return check;
    }

    private int checkUpRight(int row, int col, int playerNumber)
    {
        int check = 0;
        for(int i = 0; i < 4; i++)
        {
            if(row - i < 0 || col + i > 6)
            {
                break;
            }
            if (board[row - i][col + i] == playerNumber)
            {
                check++;
            }
            else
            {
                break;
            }
        }
        return check;
    }

    private int checkUpLeftToDownRight(int row, int col, int playerNumber)
    {
        int upLeftResult = checkUpLeft( row, col, playerNumber);
        int downRightResult = checkDownRight( row, col, playerNumber);
        int total = upLeftResult + downRightResult;
        return total;
    }

    private int checkUpLeft(int row, int col, int playerNumber)
    {
        int check = 0;
        for(int i = 0; i < 4; i++)
        {
            if(row - i < 0 || col - i < 0)
            {
                break;
            }
            if (board[row - i][col - i] == playerNumber)
            {
                check++;
            }
            else
            {
                break;
            }
        }
        return check;
    }

    private int checkDownRight(int row, int col, int playerNumber)
    {
        int check = 0;
        for(int i = 0; i < 4; i++)
        {
            if(row + i > 5 || col + i > 6)
            {
                break;
            }
            if (board[row + i][col + i] == playerNumber)
            {
                check++;
            }
            else
            {
                break;
            }
        }
        return check ;
    }

    public int getWinner(int row, int col, int playerNumber)
    {
        if (checkDown(row, col, playerNumber) == 4 || checkHorizontal(row, col, playerNumber) > 4 || checkDownLeftToUpRight(row, col, playerNumber) > 4 || checkUpLeftToDownRight(row, col, playerNumber) > 4)
        {
            return playerNumber;
        }
        else if(count == 42)
        {
            return 3;
        }
        else
        {
            return 0;
        }
    }

    @Override
    public String toString() {

        String print = "";
        for(int row = 0; row < board.length; row++)
        {
            print += "\n|";
            for(int col = 0; col < board[0].length; col++)
            {
                if(board[row][col] == 1){
                    print += "X|";
                }
                else if(board[row][col] == 2) {
                    print += "0|";
                }
                else {
                    print += "_|";
                }
            }
        }
        print += "\n 1 2 3 4 5 6 7";
        return print;
    }
}