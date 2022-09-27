package com.java.concepts.core.java.sudoku;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.concepts.core.java.sudoku.SudokuExample1;

public class SudokuExample1Test {

	@Test
	public void validateSudokuSuccessCase() {
		List<Integer> row1 = Arrays.asList(1, 2, 3);
		List<Integer> row2 = Arrays.asList(4, 5, 6);
		List<Integer> row3 = Arrays.asList(7, 8, 9);

		List<List<Integer>> grid = new ArrayList<>();
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		String res = SudokuExample1.validateSudokuBoard(grid);
		assertEquals(res, "Sudoku board is valid");

	}

	@Test
	public void validateSudokuFailureCase() {
		List<Integer> row1 = Arrays.asList(1, 2, 3);
		List<Integer> row2 = Arrays.asList(4, 5, 5);
		List<Integer> row3 = Arrays.asList(7, 8, 9);

		List<List<Integer>> grid = new ArrayList<>();
		grid.add(row1);
		grid.add(row2);
		grid.add(row3);
		String res = SudokuExample1.validateSudokuBoard(grid);
		assertEquals(res, "Sudoku board is invalid");

	}
}
