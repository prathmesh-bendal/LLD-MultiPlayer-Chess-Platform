package com.pbendal.practice.chess.player;

import java.util.ArrayList;
import java.util.List;

import com.pbendal.practice.chess.game.Game;

public class Player {
	
	private String username;
	private int gamesPlayed;
	private int gamesLost;
	private int gamesDrawed;
	private int gamesWon;
	private List<PlayerStat> pastGames;
	private Game activeGame;
	public Player(String username) {
		super();
		this.username = username;
		this.gamesPlayed = 0;
		this.gamesLost = 0;
		this.gamesDrawed = 0;
		this.gamesWon=0;
		this.pastGames = new ArrayList<>();
	}
	
	public int getGamesWon() {
		return gamesWon;
	}

	public void setGamesWon(int gamesWon) {
		this.gamesWon = gamesWon;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
	public int getGamesLost() {
		return gamesLost;
	}
	public void setGamesLost(int gamesLost) {
		this.gamesLost = gamesLost;
	}
	public int getGamesDrawed() {
		return gamesDrawed;
	}
	public void setGamesDrawed(int gamesDrawed) {
		this.gamesDrawed = gamesDrawed;
	}
	public List<PlayerStat> getPastGames() {
		return pastGames;
	}
	public void setPastGames(List<PlayerStat> pastGames) {
		this.pastGames = pastGames;
	}
	
	public void addGame(PlayerStat stat)
	{
		List<PlayerStat> games=this.getPastGames();
		games.add(stat);
		this.setPastGames(games);
	}

	public Game getActiveGame() {
		return activeGame;
	}

	public void setActiveGame(Game activeGame) {
		this.activeGame = activeGame;
	}
	
	
	
	
	
	
	

}
