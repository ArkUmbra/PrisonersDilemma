package com.arkumbra;

public class Rules {
	private static final int HIGH	= 300;
	private static final int MED	= 200;
	private static final int LOW	= 100;
	private static final int NONE	= 0;
	
	/** 
	 * Distributes payout into the Match.
	 * @param m
	 * @param p1
	 * @param p2
	 */
	public static void calculatePayout(Match m, MoveType p1, MoveType p2) {
		if(p1.equals(MoveType.COOPERATE)) {
			if(p2.equals(MoveType.COOPERATE)) 	m.addTurnPayout(MED, MED);
			if(p2.equals(MoveType.DEFECT))		m.addTurnPayout(LOW, HIGH);
		}
		
		if(p1.equals(MoveType.DEFECT)) {
			if(p2.equals(MoveType.COOPERATE))	m.addTurnPayout(HIGH, LOW);
			if(p2.equals(MoveType.DEFECT))		m.addTurnPayout(NONE, NONE);
		}
		
	}
}
