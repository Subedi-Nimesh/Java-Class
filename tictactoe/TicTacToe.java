package assignment.tictactoe;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;


public class TicTacToe
{
    public static void main (String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        Board myBoard;
        List<String> arr = Arrays.asList("1", "2", "3");
        System.out.print("Welcome! Do you want to play TicTacToe(Y/N) : ");
        String choice = scnr.next();
        while(choice.equals("y") || choice.equals("Y")) {
            myBoard = new Board();

            System.out.print("Enter the name of First player : ");
            String firstName = scnr.next();
            System.out.print("Enter the name of Second player : ");
            String secondName = scnr.next();

            Players player1 = new Players(firstName, 1);
            Players player2 = new Players(secondName, 2);

            int playerNumber = 1;
//            char chip;


            System.out.println(myBoard);

            boolean gameIsOnGoing = true;
            while(gameIsOnGoing)
            {
                if(playerNumber == 1)
                    System.out.print(player1.getName() + ", Enter the Column : ");
                else
                    System.out.print(player2.getName() + ", Enter the Column : ");

                String inputColumn = scnr.next();

                if(playerNumber == 1)
                    System.out.print(player1.getName() + ", Enter the Row : ");
                else
                    System.out.print(player2.getName() + ", Enter the Row : ");

                String inputRow = scnr.next();

                if(arr.contains(inputColumn) && arr.contains(inputRow))
                {
                    int column = Integer.parseInt(inputColumn) - 1;
                    int row = Integer.parseInt(inputRow) - 1;

                    int check = myBoard.dropChip(column, row, playerNumber);

                    if (check != -1) {
                        System.out.println(myBoard);
                        int winnerResult = myBoard.getWinner(row, column, playerNumber);
                        if (winnerResult == 1) {
                            System.out.printf("Congratulation %s! YOU WON %n", player1.getName());
                            gameIsOnGoing = false;
                        } else if (winnerResult == 2) {
                            System.out.printf("Congratulation %s! YOU WON %n", player2.getName());
                            gameIsOnGoing = false;
                        } else if (winnerResult == 3) {
                            System.out.println("It's a Tie.");
                            gameIsOnGoing = false;
                        } else {
                            playerNumber = playerNumber % 2;
                            playerNumber++;
                        }
                    } else {
                        System.out.println("Invalid Input! Please Try Again.");
                    }
                } else {
                    System.out.println("Invalid Input! Please Try Again.");
                }
            }
            System.out.println("Do you want to play again");
            choice = scnr.next();
        }
        System.out.println("Good-Bye!");
    }
}