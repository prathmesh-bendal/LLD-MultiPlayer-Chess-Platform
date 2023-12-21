package com.pbendal.practice.chess.game;

public class Board {
	Cell[][] board;
	public Board()
	{
		board=new Cell[8][8];
		
		Color curr=Color.WHITE;
		
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				board[i][j].setColor(curr);
				if(curr==Color.WHITE)
					curr=Color.BLACK;
				else
					curr=Color.WHITE;
			}
		}
		
		for(int i=0;i<8;i++)
		{
			board[1][i].setPiece(Piece.PAWN);
			board[6][i].setPiece(Piece.PAWN);
		}
		// place rook ,queen,bishop and king
		
	}
	public Cell[][] getBoard() {
		return board;
	}
	public void setBoard(Cell[][] board) {
		this.board = board;
	}
	
	public void setValue()
	{
		
	}
	

}
