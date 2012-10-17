package com.arkumbra.bots;

import java.util.ArrayList;
import java.util.List;

import com.arkumbra.IPlayer;
import com.arkumbra.MoveType;

/**
 * Plays the move the opponent has most often played
 * @author luke.gardener
 *
 */
public class LukeBot implements IPlayer {
	
	List<MoveType> oppMoves = new ArrayList<MoveType>();
	
	@Override
	public MoveType getFirstMove() {
		return MoveType.COOPERATE;
	}

	@Override
	public MoveType getNextMove(MoveType opponentsLastMove) {
		oppMoves.add(opponentsLastMove);
		
		int coopC	= 0;
		int defectC	= 0;
		for(MoveType m: oppMoves) {
			if(m.equals(MoveType.COOPERATE)) 	coopC++;
			if(m.equals(MoveType.DEFECT))		defectC++;
		}
		
		return (coopC > defectC) ? MoveType.COOPERATE : MoveType.DEFECT;
	}
}