package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.game.Scenes.MenuScene;

public class MyGdxTest extends Game {

		@Override
		public void create() {
			setScreen(new MenuScene());
		}

}
