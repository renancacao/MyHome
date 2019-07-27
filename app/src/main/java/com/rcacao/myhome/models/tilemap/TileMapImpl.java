package com.rcacao.myhome.models.tilemap;

import android.graphics.Point;
import android.graphics.Rect;

import com.rcacao.myhome.models.sprites.Sprite;

import java.util.List;

public class TileMapImpl implements TileMap {

    private Sprite      sprite;
    private List<Point> points;

    public TileMapImpl(Sprite sprite, List<Point> points) {
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

