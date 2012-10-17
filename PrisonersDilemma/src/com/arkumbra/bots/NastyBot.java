package com.arkumbra.bots;

import com.arkumbra.IPlayer;
import com.arkumbra.MoveType;

public class NastyBot implements IPlayer {

	@Override
	public MoveType getFirstMove() {
		return MoveType.DEFECT;
	}

	@Override
	public MoveType getNextMove(MoveType opponentsLastMove) {
		return MoveType.DEFECT;
	}

}
