package com.cutomescripts.ap.spring_scripts.game;

import org.springframework.stereotype.Component;

//@Component
public class MarioGame implements GameingConsole {
	
	
	public void upperButton() {
		System.out.println("going up!!");
	}
	public void downButton() {
		System.out.println("going down!!");
	}
	public void rightButton() {
		System.out.println("going stop!!");
	}
	public void leftButton() {
		System.out.println("Drift!!");
	}
}
