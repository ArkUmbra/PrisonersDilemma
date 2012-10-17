package com.arkumbra.bots;

import com.arkumbra.IPlayer;
import com.arkumbra.MoveType;

public class NaiveBot implements IPlayer {

	@Override
	public MoveType getFirstMove() {
		return MoveType.COOPERATE;
	}

	@Override
	public MoveType getNextMove(MoveType opponentsLastMove) {
		return MoveType.COOPERATE;
	}

}
