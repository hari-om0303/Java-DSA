import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class tic_tac_toe {

    static String[] board;
    static String turn;

    // check winner
    static String checkWinner() {

        for (int a = 0; a < 8; a++) {
            String line = "";

            switch (a) {
                case 0: line = board[0] + board[1] + board[2]; break;
                case 1: line = board[3] + board[4] + board[5]; break;
                case 2: line = board[6] + board[7] + board[8]; break;
                case 3: line = board[0] + board[3] + board[6]; break;
                case 4: line = board[1] + board[4] + board[7]; break;
                case 5: line = board[2] + board[5] + board[8]; break;
                case 6: line = board[0] + board[4] + board[8]; break;
                case 7: line = board[2] + board[4] + board[6]; break;
            }

            if (line.equals("XXX")) return "X";
            if (line.equals("OOO")) return "O";
        }

        // check draw
        for (int i = 0; i < 9; i++) {
            if (Arrays.asList(board).contains(String.valueOf(i + 1))) {
                return null; // game still running
            }
        }

        return "draw";
    }

    // print board
    static void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;

        // initialize board
        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i + 1);
        }

        System.out.println("Welcome to Tic Tac Toe!");
        printBoard();
        System.out.println("X will play first.");

        while (winner == null) {
            int numInput;

            try {
                System.out.print(turn + "'s turn. Enter slot number (1-9): ");
                numInput = sc.nextInt();

                if (numInput < 1 || numInput > 9) {
                    System.out.println("Invalid input. Try again.");
                    continue;
                }

                if (board[numInput - 1].equals(String.valueOf(numInput))) {
                    board[numInput - 1] = turn;
                    turn = turn.equals("X") ? "O" : "X";

                    printBoard();
                    winner = checkWinner();
                } else {
                    System.out.println("Slot already taken. Try again.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); // clear buffer
            }
        }

        // final result
        if (winner.equals("draw")) {
            System.out.println("It's a draw!");
        } else {
            System.out.println("Congratulations! " + winner + " wins!");
        }

        sc.close();
    }
}
