package com.arkumbra;

import java.util.HashMap;
import java.util.Map;

import com.arkumbra.bots.LukeBot;
import com.arkumbra.bots.NaiveBot;
import com.arkumbra.bots.NastyBot;
import com.arkumbra.bots.RandomBot;

public class Game {
	
	private int turns = 40;
	public Game() {
		Match m = new Match(turns, new NaiveBot(), new NastyBot());
		m.runMatch();
		
		m = new Match(turns, new NaiveBot(), new LukeBot());
		m.runMatch();
		
		m = new Match(turns, new NaiveBot(), new RandomBot());
		m.runMatch();
		
		m = new Match(turns, new NastyBot(), new LukeBot());
		m.runMatch();
		
		m = new Match(turns, new NastyBot(), new RandomBot());
		m.runMatch();
		
		m = new Match(turns, new LukeBot(), new RandomBot());
		m.runMatch();
	}

}
