package com.arkumbra.bots;

import java.util.Random;

import com.arkumbra.IPlayer;
import com.arkumbra.MoveType;

public class RandomBot implements IPlayer {

	private static Random r = new Random();
	@Override
	public MoveType getFirstMove() {
		return randomise();
	}

	@Override
	public MoveType getNextMove(MoveType opponentsLastMove) {
		return randomise();
	}
	
	private MoveType randomise() {
		if(r.nextInt(2) == 0) {
			return MoveType.COOPERATE;
		} else {
			return MoveType.DEFECT;
		}
	}

}
