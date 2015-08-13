package com.blogspot.mytechpg.libgdx.test1.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.blogspot.mytechpg.libgdx.test1.Logging;
import com.blogspot.mytechpg.libgdx.test1.MyGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 600;
		config.height = 400;
		new LwjglApplication(new MyGame(), config);
	}
}
