package com.arkumbra;

public interface IPlayer {
	
	public MoveType getFirstMove();
	
	public MoveType getNextMove(MoveType opponentsLastMove);

}
