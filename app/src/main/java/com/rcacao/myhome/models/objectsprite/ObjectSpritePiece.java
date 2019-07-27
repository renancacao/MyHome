package com.rcacao.myhome.models.objectsprite;

import android.graphics.Point;
import android.graphics.Rect;

public interface ObjectSpritePiece {
    Point getPoint();

    int getResourceId();

    Rect getSpriteSrcRect(float density);

    int getSpriteHorizontalBlocks();

    int getSpriteVerticalBlocks();

}
