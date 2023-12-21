package com.pbendal.practice.chess;

import com.pbendal.practice.chess.game.Game;
import com.pbendal.practice.chess.game.GameManager;
import com.pbendal.practice.chess.player.Player;

public class Main {
	
	public static void main(String[] args) {
		
		GameManager gm=GameManager.getGameManager();
		Player p1=new Player("p1");
		Player p2=new Player("p2");
		
		Game game=gm.startGame(p1, p2);
		
		game.MakeMove(0, 0, 0, 0);
		
	}

}
