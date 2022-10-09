package com.java.concepts.core.java.sudoku;

public class SudokuPuzzleExample {
	public boolean isSafe(int[][] arr, int row, int col, int numToInsert) {
		// the loop takes care of the clash in the row of the grid
		for (int c = 0; c < arr.length; c++) {
			// if the number that we have inserted is already present in that row then return false
			if (arr[row][c] == numToInsert) {
				return false;
			}
		}

		// the loop takes care of the clash in the column of the grid
		for (int r = 0; r < arr.length; r++) {
			// if the number that we have inserted is already present in that column then return false
			if (arr[r][col] == numToInsert) {
				return false;
			}
		}

		// the loop takes care of the clash in the sub-grid that is present in the grid
		int sqrt = (int) Math.sqrt(arr.length);
		int boxRowSt = row - row % sqrt;
		int boxColSt = col - col % sqrt;

		for (int i = boxRowSt; i < boxRowSt + sqrt; i++) {
			for (int j = boxColSt; j < boxColSt + sqrt; j++) {
				// if the number that we have inserted is already present in that sub-grid then return false
				if (arr[i][j] == numToInsert) {
					return false;
				}
			}
		}
		// if there is no clash in the grid, then it is safe and true is returned
		return true;
	}

	public boolean solveSudoku(int[][] arr, int size) {
		int row = -1;
		int col = -1;
		boolean isCellFilled = true;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (arr[i][j] == 0) {
					row = i;
					col = j;
					// false value means there is still some vacant cells in the grid
					isCellFilled = false;
					break;
				}
			}
			if (!isCellFilled) {
				break;
			}
		}

		// there is no empty space left in the grid
		if (isCellFilled) {
			return true;
		}

		// otherwise for each row do the backtracking
		for (int no = 1; no <= size; no++) {
			if (isSafe(arr, row, col, no)) {
				arr[row][col] = no;
				if (solveSudoku(arr, size)) {
					// display(board, size);
					return true;
				} else {
					arr[row][col] = 0;
				}
			}
		}
		return false;
	}

	public void display(int[][] arr, int size) {
		// We have got the solution, just display it
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

	// main method
	public static void main(String argvs[]) {
		// the 9 x 9 grid
		int[][] arr = new int[][] { 
			{ 7, 0, 0, 0, 0, 0, 2, 0, 0 }, 
			{ 4, 0, 2, 0, 0, 0, 0, 0, 3 },
			{ 0, 0, 0, 2, 0, 1, 0, 0, 0 }, 
			{ 3, 0, 0, 1, 8, 0, 0, 9, 7 }, 
			{ 0, 0, 9, 0, 7, 0, 6, 0, 0 },
			{ 6, 5, 0, 0, 3, 2, 0, 0, 1 }, 
			{ 0, 0, 0, 4, 0, 9, 0, 0, 0 }, 
			{ 5, 0, 0, 0, 0, 0, 1, 0, 6 },
			{ 0, 0, 6, 0, 0, 0, 0, 0, 8 } 
		};
		
		arr = new int[][] { 
			{ 5, 3, 0, 0, 7, 0, 0, 0, 0 }, 
			{ 6, 0, 0, 1, 9, 5, 0, 0, 0 },
			{ 0, 9, 8, 0, 0, 0, 0, 6, 0 }, 
			{ 8, 0, 0, 0, 6, 0, 0, 0, 3 }, 
			{ 4, 0, 0, 8, 0, 3, 0, 0, 1 },
			{ 7, 0, 0, 0, 2, 0, 0, 0, 6 }, 
			{ 0, 6, 0, 0, 0, 0, 2, 8, 0 }, 
			{ 0, 0, 0, 4, 1, 9, 0, 0, 5 },
			{ 0, 0, 0, 0, 8, 0, 0, 7, 9 } 
		};

		// creating an object of the class SudokuPuzzle
		SudokuPuzzleExample obj = new SudokuPuzzleExample();

		// computing the size of the grid
		int size = arr.length;

		System.out.println("The grid is: ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		
		String msg = getSudokuSolutionStatus(arr, obj, size);
		
		if(msg.contains("valid")) {
			// display solution
			obj.display(arr, size);
		} else {
			System.out.println("There is no solution available.");
		}
	}

	private static String getSudokuSolutionStatus(int[][] arr, SudokuPuzzleExample obj, int size) {
		String msg = null;
		if (obj.solveSudoku(arr, size)) {
			msg = "sudoku board valid";
			System.out.println("The solution of the grid is: ");
		} else {
			msg = "sudoku board invalid";
		}
		
		return msg;
	}
}