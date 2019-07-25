package com.rcacao.myhome.domain.sprites;

import android.graphics.Point;
import android.graphics.Rect;

import java.util.List;

public interface SpriteMap {
    int getSpriteResourceId();

    List<Point> getPoints();

    Rect getSpriteSrcRect(float density);
}
