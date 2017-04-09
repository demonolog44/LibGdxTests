package com.mygdx.game.Scenes;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Created by armok on 4/7/17.
 */
public class MenuScene implements Screen {

    private Stage stage;


    @Override
    public void show() {
        stage = new Stage();
    }

    @Override
    public void render(float delta) {
        stage.draw();//draw actors in stage
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
