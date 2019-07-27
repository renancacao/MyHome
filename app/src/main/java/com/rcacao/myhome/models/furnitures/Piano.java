package com.rcacao.myhome.models.furnitures;

import com.rcacao.myhome.R;
import com.rcacao.myhome.models.sprites.SpriteBadParameterException;
import com.rcacao.myhome.models.sprites.SpriteImpl;

public class Piano extends SpriteImpl {
    public Piano() throws SpriteBadParameterException {
        super(R.drawable.piano1, 32, 16, 0, 0, 2, 1);
    }
}
