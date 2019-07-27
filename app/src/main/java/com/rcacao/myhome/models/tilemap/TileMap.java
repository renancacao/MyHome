package com.rcacao.myhome.models.tilemap;

import android.graphics.Point;
import android.graphics.Rect;

import java.util.List;

public interface TileMap {
    int getSpriteResourceId();

    List<Point> getPoints();

    Rect getSpriteSrcRect(float density);
}
