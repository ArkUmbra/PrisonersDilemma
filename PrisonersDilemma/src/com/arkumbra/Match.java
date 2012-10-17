package com.arkumbra;

import java.util.Random;

public class Match {
	
	private int 	noOfTurns = 0;
	private IPlayer p1;
	private IPlayer p2;
	private int 	p1Points = 0;
	private int 	p2Points = 0;
	private int 	currTurn = 0;
	
	public Match(int noOfTurns, IPlayer p1, IPlayer p2) {
		this.p1 = p1;
		this.p2 = p2;
		this.noOfTurns = noOfTurns;
	}

	
	private MoveType p1Move = null;
	private MoveType p2Move = null;
	
	public void runMatch() {	
		// Flips a coin to see who moves first
		Random r = new Random();
		
		// P1 moves first
		if(r.nextInt(2) == 0) {
			p1Move = p1.getFirstMove();
			p2Move = p2.getNextMove(p1Move);
			Rules.calculatePayout(this, p1Move, p2Move);
			currTurn++;
			for(; currTurn < noOfTurns; currTurn ++) {
				p1Move = p1.getNextMove(p2Move);
				p2Move = p2.getNextMove(p1Move);
				Rules.calculatePayout(this, p1Move, p2Move);
			}
		
		// P2 moves first
		} else {
			p2Move = p2.getFirstMove();
			p1Move = p1.getNextMove(p2Move);
			Rules.calculatePayout(this, p1Move, p2Move);
			currTurn++;
			for(; currTurn < noOfTurns; currTurn ++) {

				p2Move = p2.getNextMove(p1Move);
				p1Move = p1.getNextMove(p2Move);
				Rules.calculatePayout(this, p1Move, p2Move);
			}
		}
		
		System.out.println(	"=== Points earned ===" + 
							"\n" + p1.getClass().getName() + ": " + p1Points +
							"\n" + p2.getClass().getName() + ": " + p2Points +
						  "\n====================="
				);
	}
	
	/**
	 * Usually called from Rules, handing out payment for a turn.
	 * @param p1Payout
	 * @param p2Payout
	 */
	public void addTurnPayout(int p1Payout, int p2Payout) {
		this.p1Points += p1Payout;
		this.p2Points += p2Payout;
	}
}
