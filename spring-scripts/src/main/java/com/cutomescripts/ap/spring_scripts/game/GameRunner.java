package com.cutomescripts.ap.spring_scripts.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	@Autowired
	private GameingConsole game;

	public GameRunner(GameingConsole game) {
		// TODO Auto-generated constructor stub
		this.game = game;
	}

	public void run() {
		game.upperButton();
		game.downButton();
		game.rightButton();
		game.leftButton();
	}

}
