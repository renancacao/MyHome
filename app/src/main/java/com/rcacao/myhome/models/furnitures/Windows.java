package com.rcacao.myhome.models.furnitures;

import com.rcacao.myhome.R;
import com.rcacao.myhome.models.sprites.SpriteBadParameterException;
import com.rcacao.myhome.models.sprites.SpriteImpl;

public class Windows extends SpriteImpl {
    public Windows() throws SpriteBadParameterException {
        super(R.drawable.windows1, 16, 16, 0, 0);
    }
}
