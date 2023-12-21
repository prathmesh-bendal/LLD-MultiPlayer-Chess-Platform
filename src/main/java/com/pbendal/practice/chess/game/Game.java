package com.pbendal.practice.chess.game;

import com.pbendal.practice.chess.player.Player;
import com.pbendal.practice.chess.player.PlayerStat;

public class Game {
	
	private Player p1;
	private Player p2;
	private String gameId;
	private Board board;
	private Player currPlayer;
	private int step;
	public Game(Player p1, Player p2,String id) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.currPlayer=p1;
		this.step=0;
		this.board = new Board();
		gameId=id;
	}
	
	public boolean MakeMove(int x1,int y1,int x2,int y2)
	{
		boolean valid=true;
		
		MoveStatus status=validateMove(x1, y1, x2, y2);
		Player winner=getCurrentPlayer();
		winner.setGamesWon(winner.getGamesWon()+1);
		Player looser=getNextPlayer();
		looser.setGamesLost(looser.getGamesLost()+1);
		if(status.equals(MoveStatus.INVALID))
		{
			valid= false;
		}
		else if(status.equals(MoveStatus.VALID))
		{
			Cell[][] c=this.board.getBoard();
			
			c[x2][y2]=c[x1][y1];
			c[x1][y1].setPiece(null);
			
			this.board.setBoard(c);
			
			
		}
		else
		{
			endGame(winner, looser, status);
		}
		return valid;
	}
	
	public MoveStatus validateMove(int x1,int y1,int x2,int y2)
	{
		this.step++;
		return MoveStatus.WINNING;
	}
	
	public Player getCurrentPlayer()
	{
		if(this.step%2==0)
			return this.p1;
		return this.p2;
	}
	
	public Player getNextPlayer()
	{
		if(this.step%2==0)
			return this.p2;
		return this.p1;
	}
	
	public void endGame(Player winner,Player looser,MoveStatus moveStatus)
	{
		winner.setActiveGame(null);
		looser.setActiveGame(null);
		if(moveStatus.equals(MoveStatus.WINNING))
		{
			
			winner.setGamesWon(winner.getGamesWon()+1);
			
			looser.setGamesLost(looser.getGamesLost()+1);
			
			winner.addGame(new PlayerStat(gameId, looser, GameStatus.WON));
			looser.addGame(new PlayerStat(gameId, winner, GameStatus.LOST));
			
		}
		else
		{
			p1.addGame(new PlayerStat(gameId, p2, GameStatus.DRAWED));
			p1.setGamesDrawed(p1.getGamesDrawed()+1);
			p2.addGame(new PlayerStat(gameId, p1, GameStatus.DRAWED));
			p2.setGamesDrawed(p2.getGamesDrawed()+1);
		}
	}
	
	
	

}
