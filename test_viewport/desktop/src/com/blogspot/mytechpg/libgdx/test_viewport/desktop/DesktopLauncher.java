package com.blogspot.mytechpg.libgdx.test_viewport.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.blogspot.mytechpg.libgdx.test_viewport.TestViewport;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new TestViewport(), config);
	}
}
