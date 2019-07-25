package com.rcacao.myhome.domain.sprites;

import android.graphics.Rect;

public interface Sprite {

    int getResourceId();
    Rect getSrcRect(float density);

}
