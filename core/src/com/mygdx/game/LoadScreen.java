package com.mygdx.game;


public class LoadScreen extends  BaseScreen{

    public LoadScreen(GlobosMain si) {
        super(si);
    }

    @Override
    public void render(float delta) {
        if(!assets.update()){
            return;
        }

        setScreen(new GameScreen(game));
    }
}