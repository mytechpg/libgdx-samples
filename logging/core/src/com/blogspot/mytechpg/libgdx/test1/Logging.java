package com.blogspot.mytechpg.libgdx.test1;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Logging extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		
		Gdx.app.setLogLevel(Gdx.app.LOG_INFO);
		Gdx.app.debug("logging", "Debug level log");
		Gdx.app.log("logging", "Info level log");
		Gdx.app.error("logging", "Error level log");
		
		Gdx.app.debug("logging", "Debug level log + exception", new Exception("debug level"));
		Gdx.app.error("logging", "Error level log + exception", new Exception("error level"));
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
}
