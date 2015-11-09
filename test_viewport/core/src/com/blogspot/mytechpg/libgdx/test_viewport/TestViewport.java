package com.blogspot.mytechpg.libgdx.test_viewport;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class TestViewport extends ApplicationAdapter implements InputProcessor {
	SpriteBatch batch;
	Texture img;
	
	private StretchViewport stretchVP;	// counter = 0
	private FillViewport fillVP;		// counter = 1
	private FitViewport fitVP;			// counter = 2
	private ExtendViewport extendVP;	// counter = 3
	private ScreenViewport screenVP;	// counter = 4
	
	private Viewport viewport;
	private int counter;
	private String vpName; 
	
	private Camera camera;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("square_800x600.png");
		
		camera = new OrthographicCamera();
		
		stretchVP = new StretchViewport(800,600, camera);
		fillVP = new FillViewport(800,600, camera);
		fitVP = new FitViewport(800,600, camera);
		extendVP = new ExtendViewport(800,600, camera);
		screenVP = new ScreenViewport(camera);
		
		viewport = stretchVP;
		vpName = "StretchViewport";
		counter = 0;
		System.out.println("Viewport: " + vpName);
		
		Gdx.input.setInputProcessor(this);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.setProjectionMatrix(camera.combined);

		batch.begin();
		batch.draw(img, -img.getWidth()/2, -img.getHeight()/2);
		batch.end();
	}
	
	@Override
	public void resize(int width, int height) {
	    viewport.update(width, height);
	    System.out.println("resize " + width + " " + height);
	    
	}

	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		counter = (counter +1) % 5;
		
		switch (counter) {
			case 0:
				viewport = stretchVP;
				vpName = "StretchViewport";
				break;
			case 1:
				viewport = fillVP;
				vpName = "FillViewport";
				break;
			case 2:
				viewport = fitVP;
				vpName = "FitViewport";
				break;
			case 3:
				viewport = extendVP;
				vpName = "ExtendViewport";
				break;
			case 4:
				viewport = screenVP;
				vpName = "ScreenViewport";
				break;
				
		}
		
		viewport.update(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		System.out.println("Viewport: " + vpName);
		
		return true;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}
}
