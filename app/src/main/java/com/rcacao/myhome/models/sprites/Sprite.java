package com.rcacao.myhome.models.sprites;

import android.graphics.Rect;

public interface Sprite {

    int getResourceId();
    Rect getSrcRect(float density);

}
