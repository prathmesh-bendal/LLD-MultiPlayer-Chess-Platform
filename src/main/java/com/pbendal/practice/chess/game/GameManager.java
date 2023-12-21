package com.pbendal.practice.chess.game;

import com.pbendal.practice.chess.player.Player;

public class GameManager {
	
	private static GameManager gm=new GameManager();

	private GameManager() {
		super();
	}
	
	public static GameManager getGameManager()
	{
		return gm;
	}
	
	public Game startGame(Player p1,Player p2)
	{
		if(p1.getActiveGame()!=null || p2.getActiveGame()!=null)
			return null;
		String gameId=generateGameId();
		Game game=new Game(p1, p2,gameId);
		p1.setActiveGame(game);
		p2.setActiveGame(game);
		p1.setGamesPlayed(p1.getGamesPlayed()+1);
		p2.setGamesPlayed(p2.getGamesPlayed()+1);
		
		
		return game;
	}
	
	public String generateGameId()
	{
		return "";
	}
	

}
