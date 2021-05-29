package com.game;

public class BroadGameImpl implements BroadGame {

	private int board[][] = new int[3][3]; // default value of array is 0
	
	private static final int NO_WINNER = 0;
	private static final int X = 1;
	private static final int O = 2;
	
	/*  00 | 01 | 02
	 *  10 | 11 | 12
	 *  20 | 21 | 22
	 */
	@Override
	public String getWinner() {
		int winner = NO_WINNER;
		if (board[0][0] == board[0][1] && board[0][1] == board[0][2]) { winner = board[0][0]; }
		else if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) { winner = board[0][0]; }
		else if (board[0][0] == board[1][0] && board[1][0] == board[2][0]) { winner = board[0][0]; }
		else if (board[1][0] == board[1][1] && board[1][1] == board[1][2]) { winner = board[1][0]; }
		else if (board[0][1] == board[1][1] && board[1][1] == board[2][1]) { winner = board[0][1]; }
		else if (board[2][0] == board[2][1] && board[2][1] == board[2][2]) { winner = board[2][0]; }
		else if (board[2][0] == board[1][1] && board[1][1] == board[0][2]) { winner = board[2][0]; }
		else if (board[0][2] == board[1][2] && board[1][2] == board[2][2]) { winner = board[2][2]; }
		return winner == NO_WINNER ? null : winner == X ? "X" : "O";
	}

	@Override
	public boolean takeSlot(boolean isX, int row, int col) {
		boolean isFreeSpace = board[row-1][col-1] == 0;
		if(isFreeSpace) {
			board[row-1][col-1] = isX ? X : O;
		}
		print();
		return isFreeSpace;
	}
	
	public void print() {
		for (int i = 0 ; i < board.length ; i++) {
			for (int j = 0 ; j < board[i].length ; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
