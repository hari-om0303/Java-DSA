public class Sudoko {

    public static void main(String[] args) {
        // Define the Sudoku board
        // 0 means the cell is empty and needs to be filled
        int[][] board = new int[][] {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        // Try to solve the Sudoku
        if (solve(board)) {
            // If solved, print the solved board
            display(board);
        } else {
            System.out.println("Cannot solve this Sudoku");
        }
    }

    // ------------------- Solver method -------------------
    static boolean solve(int[][] board) {
        int n = board.length;   // board size (9 for 9x9 Sudoku)

        int row = -1; // to store the row index of an empty cell
        int col = -1; // to store the column index of an empty cell
        boolean isEmpty = true; // flag to track if any empty cell is found

        // Find the next empty cell (marked with 0)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    isEmpty = false; // we found an empty cell
                    break; // stop checking further in this row
                }
            }
            if (!isEmpty) { // if an empty cell was found, stop checking further
                break;
            }
        }

        // Base case: if there are no empty cells left, Sudoku is solved
        if (isEmpty) {
            return true;
        }

        // Try numbers 1 to 9 in the empty cell
        for (int number = 1; number <= 9; number++) {
            // Check if placing this number is valid
            if (isSafe(board, row, col, number)) {
                board[row][col] = number; // place the number

                // Recursively try to solve the rest of the board
                if (solve(board)) {
                    return true; // if solved, return true
                } else {
                    // If placing number didn't lead to solution, backtrack
                    board[row][col] = 0;
                }
            }
        }

        // If no number 1-9 works here, return false (backtrack further)
        return false;
    }

    // ------------------- Display method -------------------
    private static void display(int[][] board) {
        for (int[] row : board) {       // for each row
            for (int num : row) {       // for each number in the row
                System.out.print(num + " ");
            }
            System.out.println();       // move to the next line after each row
        }
    }

    // ------------------- Safety check method -------------------
    static boolean isSafe(int[][] board, int row, int col, int num) {
        // 1. Check the row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false; // number already exists in this row
            }
        }

        // 2. Check the column
        for (int[] nums : board) {
            if (nums[col] == num) {
                return false; // number already exists in this column
            }
        }

        // 3. Check the 3x3 subgrid
        int sqrt = (int) Math.sqrt(board.length); // for 9x9 Sudoku, sqrt = 3
        int rowStart = row - row % sqrt; // starting row of the subgrid
        int colStart = col - col % sqrt; // starting column of the subgrid

        // loop over the 3x3 box
        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false; // number already exists in this 3x3 box
                }
            }
        }

        // If row, column, and subgrid are all safe, return true
        return true;
    }
}
