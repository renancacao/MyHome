package com.rcacao.myhome.models.tiles;

import com.rcacao.myhome.R;
import com.rcacao.myhome.models.sprites.SpriteBadParameterException;
import com.rcacao.myhome.models.sprites.SpriteImpl;

public class CommonFloor extends SpriteImpl {

    public CommonFloor() throws SpriteBadParameterException {
        super(R.drawable.common_floor, 16, 16, 0, 0);
    }
}
