package com.rcacao.myhome.domain.sprites;

import android.graphics.Point;
import android.graphics.Rect;

import java.util.List;

public class SpriteMapImpl implements SpriteMap {

    private Sprite      sprite;
    private List<Point> points;

    public SpriteMapImpl(Sprite sprite, List<Point> points) {
        this.sprite = sprite;
        this.points = points;
    }

    @Override
    public int getSpriteResourceId() {
        return sprite.getResourceId();
    }

    @Override
    public List<Point> getPoints() {

        return points;
    }

    @Override
    public Rect getSpriteSrcRect(float density) {
        return sprite.getSrcRect(density);
    }
}

