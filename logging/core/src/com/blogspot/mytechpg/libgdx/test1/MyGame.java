package com.blogspot.mytechpg.libgdx.test1;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class MyGame extends Game {
	MyScreen1 scr1 = new MyScreen1();
	MyScreen2 scr2 = new MyScreen2();
	int scr = 1;
		
	@Override
	public void create() {
		Gdx.app.setLogLevel(Gdx.app.LOG_DEBUG);
		Gdx.app.debug("Game-Screen", "MyGame: create()");
		scr = 1;
		setScreen(scr1);
	}
	
	@Override
	public void pause() {
		Gdx.app.debug("Game-Screen", "MyGame: pause()");
		super.pause();
	}
	
	@Override
	public void resume() {
		Gdx.app.debug("Game-Screen", "MyGame: resume()");
		if (scr == 1) {
			scr = 2;
			setScreen(scr2);
			Gdx.app.debug("Game-Screen", "MyGame: change to 2");
		} else {
			scr = 1;
			setScreen(scr1);
			Gdx.app.debug("Game-Screen", "MyGame: change to 1");
		}
			
		super.resume();
	}

}
