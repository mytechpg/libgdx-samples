package com.blogspot.mytechpg.libgdx.test1;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyScreen1 implements Screen {
	SpriteBatch batch = null;
	Texture img = null;
	
	/*
	public MyScreen1() {
	}
	*/
	
	@Override
	public void show() {
		Gdx.app.debug("Game-Screen", "MyScreen1: show()");
		if (batch == null)
			batch = new SpriteBatch();
		if (img == null)
			img = new Texture("badlogic.jpg");
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
		Gdx.app.debug("Game-Screen", "MyScreen1: resize()");
	}

	@Override
	public void pause() {
		Gdx.app.debug("Game-Screen", "MyScreen1: pause()");
	}

	@Override
	public void resume() {
		Gdx.app.debug("Game-Screen", "MyScreen1: resume()");
	}

	@Override
	public void hide() {
		Gdx.app.debug("Game-Screen", "MyScreen1: hide()");
	}

	@Override
	public void dispose() {
		Gdx.app.debug("Game-Screen", "MyScreen1: dispose()");
		batch.dispose();
		img.dispose();
	}

}
