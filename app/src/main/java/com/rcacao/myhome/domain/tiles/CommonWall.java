package com.rcacao.myhome.domain.tiles;

import com.rcacao.myhome.R;
import com.rcacao.myhome.domain.sprites.SpriteBadParameterException;
import com.rcacao.myhome.domain.sprites.SpriteImpl;

public class CommonWall extends SpriteImpl {

    public CommonWall() throws SpriteBadParameterException {
        super(R.drawable.common_wall, 16, 16, 0, 0);
    }
}
