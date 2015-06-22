package it.blogspot.mytechpg.tests;

import com.badlogic.gdx.Game;

public class GameLogging extends Game {

	@Override
	public void create() {
		ScreenLog scr = new ScreenLog();
		setScreen(scr);
	}

}
