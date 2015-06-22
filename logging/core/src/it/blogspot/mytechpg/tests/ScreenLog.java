package it.blogspot.mytechpg.tests;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.utils.Logger;

public class ScreenLog implements Screen {
	Logger log;
		
	public ScreenLog() {
		log = new Logger("Logging app", Logger.INFO);
		
		
		Gdx.app.setLogLevel(Application.LOG_INFO);
		//Gdx.app.setLogLevel(Application.LOG_ERROR);
		log.setLevel(Logger.INFO);
		Gdx.app.log("gdx", "Logging app");
		log.info("created");
	}
	
	@Override
	public void show() {
		log.info("show");
		Gdx.app.log("gdx", "show");
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}

	@Override
	public void resize(int width, int height) {
		log.info("resize");
		Gdx.app.log("gdx", "resize");
	}

	@Override
	public void pause() {
		log.info("pause");
		Gdx.app.log("gdx", "pause");
	}

	@Override
	public void resume() {
		log.info("resume");
		Gdx.app.log("gdx", "resume");
	}

	@Override
	public void hide() {
		log.info("hide");
		Gdx.app.log("gdx", "hide");
	}

	@Override
	public void dispose() {
		log.info("dispose");
		Gdx.app.log("gdx", "dispose");
	}

}
