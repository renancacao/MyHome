package com.rcacao.myhome.models.objectsprite;

import android.graphics.Point;
import android.graphics.Rect;

import com.rcacao.myhome.models.sprites.Sprite;

public class ObjectSpritePieceImpl implements ObjectSpritePiece {

    private Point  point;
    private Sprite sprite;

    public ObjectSpritePieceImpl(Point point, Sprite sprite) {
        this.point = point;
        this.sprite = sprite;
    }

    @Override
    public Point getPoint() {
        return point;
    }

    @Override
    public int getResourceId() {
        return sprite.getResourceId();
    }

    @Override
    public Rect getSpriteSrcRect(float density) {
        return sprite.getSrcRect(density);
    }

    @Override
    public int getSpriteHorizontalBlocks() {
        return sprite.getHorizontalBlocks();
    }


    @Override
    public int getSpriteVerticalBlocks() {
        return sprite.getVerticalBlocks();
    }


}
