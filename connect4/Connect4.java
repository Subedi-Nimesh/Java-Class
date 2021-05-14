package assignment.connect4;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Connect4 {
    public static void main (String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        Board myBoard;
        List Column = Arrays.asList("1", "2", "3", "4", "5", "6", "7");
        System.out.print("Welcome! Do you want to play Connect 4(Y/N) : ");
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
            char chip;


            System.out.println(myBoard.toString());

            boolean gameIsOnGoing = true;
            while(gameIsOnGoing)
            {
                if(playerNumber == 1)
                    System.out.print(player1.getName() + ", Enter the Column to drop chip : ");
                else
                    System.out.print(player2.getName() + ", Enter the Column to drop chip : ");

                String col = scnr.next();
                if(Column.contains(col))
                {
                    int column = Integer.parseInt(col) - 1;
                    int row = myBoard.dropChip(column, playerNumber);
                    if(row != -1)
                    {
                        System.out.println(myBoard.toString());
                        int winnerResult = myBoard.getWinner(row, column, playerNumber);
                        if (winnerResult == 1)
                        {
                            System.out.printf("Congratulation %s! YOU WON %n", player1.getName());
                            gameIsOnGoing = false;
                        }
                        else if (winnerResult == 2)
                        {
                            System.out.printf("Congratulation %s! YOU WON %n", player2.getName());
                            gameIsOnGoing = false;
                        }
                        else if (winnerResult == 3)
                        {
                            System.out.println("It's a Tie.");
                            gameIsOnGoing = false;
                        }
                        else
                        {
                            playerNumber = playerNumber % 2;
                            playerNumber++;
                        }
                    }
                    else
                    {
                        System.out.printf("Column %s is full. Please Try Again.%n%n", col);
                    }
                }
                else
                {
                    System.out.println("Invalid Input! Please Try Again.");
                    continue;
                }
            }
            System.out.println("Do you want to play again");
            choice = scnr.next();
        }
        System.out.println("Good-Bye!");
    }
}
