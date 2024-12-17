package com.cutomescripts.ap.spring_scripts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.cutomescripts.ap.spring_scripts.game.GameRunner;
import com.cutomescripts.ap.spring_scripts.game.GameingConsole;
import com.cutomescripts.ap.spring_scripts.game.MarioGame;
import com.cutomescripts.ap.spring_scripts.game.SuperContraGame;

@SpringBootApplication
public class SpringScriptsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(SpringScriptsApplication.class, args);
		//MarioGame game = new MarioGame();
//		GameingConsole game = new MarioGame();
//		GameRunner runner = new GameRunner(game);
		
		context.getBean(GameRunner.class).run();
	}

}
