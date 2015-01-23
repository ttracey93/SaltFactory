package com.mygdx.game.listeners;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.mygdx.game.entity.playerutils.Keys;

/**
 * Created by Dubforce on 1/22/2015.
 */
public class InputListener extends InputAdapter {
    @Override
    public boolean keyDown(int keycode) {
        switch(keycode) {
            case Input.Keys.LEFT:
                Keys.setKeyState(Keys.LEFT, true);
                break;
            case Input.Keys.RIGHT:
                Keys.setKeyState(Keys.RIGHT, true);
                break;
            case Input.Keys.SPACE:
                Keys.setKeyState(Keys.JUMP, true);
                break;
            default:
                break;
        }

        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        switch(keycode) {
            case Input.Keys.LEFT:
                Keys.setKeyState(Keys.LEFT, false);
                break;
            case Input.Keys.RIGHT:
                Keys.setKeyState(Keys.RIGHT, false);
                break;
            case Input.Keys.SPACE:
                Keys.setKeyState(Keys.JUMP, false);
                break;
            default:
                break;
        }

        return false;
    }
}
