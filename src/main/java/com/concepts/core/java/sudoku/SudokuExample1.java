package com.concepts.core.java.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SudokuExample1 {

	public static void main(String[] args) {
		// Valid Sudoku case

		List<Integer> row1 = Arrays.asList(1, 2, 3);
		List<Integer> row2 = Arrays.asList(4, 5, 6);
		List<Integer> row3 = Arrays.asList(7, 8, 9);

		List<List<Integer>> grid = new ArrayList<>();
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);

		System.out.println("============== Start: Valid case =================");

		String res = validateSudokuBoard(grid);
		System.out.println(res);
		System.out.println("============== End: Valid case =================");

		// Invalid Sudoku case
		row1 = Arrays.asList(1, 2, 3);
		row2 = Arrays.asList(4, 5, 5);
		row3 = Arrays.asList(7, 8, 9);

		grid = new ArrayList<>();
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);

		System.out.println("============== Start: Invalid case =================");
		res = validateSudokuBoard(grid);
		System.out.println(res);
		System.out.println("============== End: Invalid case =================");

	}

	public static String validateSudokuBoard(List<List<Integer>> gridList) {

		boolean flag = false;
		String result = "";
		int listSize = gridList.size();
		for (int i = 0; i < listSize - 1; i++) {
			List<Integer> row = gridList.get(i);

			if (row != null && !row.isEmpty()) {
				if (new HashSet<Integer>(row).size() < 3) {
					result = "Sudoku board is invalid";
					break;
				} else {
					if (i == 0) {
						flag = validateGrid(row, gridList.get(i + 1), gridList.get(i + 2));
					} else if (i == 1) {
						flag = validateGrid(row, gridList.get(i - 1), gridList.get(i + 1));
					} else {
						flag = validateGrid(row, gridList.get(i - 2), gridList.get(i - 1));
					}

					if (!flag) {
						result = "Sudoku board is invalid";
						break;
					}

					if (flag) {
						result = "Sudoku board is valid";
					}
				}
			}
		}
		return result;
	}

	public static boolean validateGrid(List<Integer> row, List<Integer> list1, List<Integer> list2) {
		for (Integer i : row) {
			if (list1.contains(i) || list2.contains(i)) {
				return false;
			}
		}
		return true;
	}
}
