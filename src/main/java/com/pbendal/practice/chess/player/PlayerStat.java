package com.pbendal.practice.chess.player;

import com.pbendal.practice.chess.game.GameStatus;

public class PlayerStat {
	
	private String gameId;
	private Player opponent;
	private GameStatus gameStatus;
	public PlayerStat(String gameId, Player opponent, GameStatus gameStatus) {
		super();
		this.gameId = gameId;
		this.opponent = opponent;
		this.gameStatus = gameStatus;
	}
	
	

}
