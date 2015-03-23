package com.brad.ScaffoldGDX;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.assets.AssetManager;
import com.brad.ScaffoldGDX.framework.config.Controls;
import com.brad.ScaffoldGDX.game.screens.MainGameScreen;

public class ScaffoldGDX extends Game
{
    public static final String TITLE = "ScaffoldGDX";
    public static final int WIDTH = 640, HEIGHT = 480;
    public Controls controls;
    public AssetManager manager;
    public InputMultiplexer input;

    public void create() {
        controls = new Controls();
        manager = new AssetManager();
        input = new InputMultiplexer();
        Gdx.input.setInputProcessor(input);
        setScreen(new MainGameScreen(this, 60, 60, WIDTH, HEIGHT));
    }

    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        manager.dispose();
    }
}