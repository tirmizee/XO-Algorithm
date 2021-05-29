package com.game;

public class DemoBroadGame {

	public static void main(String[] args) {
		BroadGameImpl game = new BroadGameImpl();
		game.takeSlot(true, 1, 3);
		System.out.println("Winner : " +  game.getWinner());
		game.takeSlot(true, 2, 3);
		System.out.println("Winner : " +  game.getWinner());
		game.takeSlot(true, 3, 3);
		System.out.println("Winner : " +  game.getWinner());
	}

}
