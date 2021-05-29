package com.game;

public interface BroadGame {

	String getWinner();
	
	boolean takeSlot(boolean isX, int row, int col);
	
}
