package com.rcacao.myhome.drawers;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;

import com.rcacao.myhome.MyApplication;
import com.rcacao.myhome.models.tilemap.TileMap;
import com.rcacao.myhome.utils.DrawUtils;

import javax.inject.Inject;

public class TileMapDrawerImpl implements Drawer {

    private static final int DEFAULT_DENSITY = 1;
    @Inject
    DrawUtils drawUtils;
    private TileMap[] tileMaps;
    private int       blockSize;
    private int       horizontalPadding;
    private int       verticalPadding;

    public TileMapDrawerImpl(TileMap[] tileMaps) {
        this.tileMaps = tileMaps;
        MyApplication.getDrawUtilsComponent().inject(this);

    }

    @Override
    public void setBlockSize(int blockSize) {
        this.blockSize = blockSize;
    }

    @Override
    public void setHorizontalPadding(int horizontalPadding) {
        this.horizontalPadding = horizontalPadding;
    }

    @Override
    public void setVerticalPadding(int verticalPadding) {
        this.verticalPadding = verticalPadding;
    }

    @Override
    public void draw(Canvas canvas) {

        for (TileMap tileMap : tileMaps) {
            drawTileMap(canvas, tileMap);
        }

    }

    private void drawTileMap(Canvas canvas, TileMap tileMap) {

        Bitmap bitmap = drawUtils.createBitmap(tileMap.getSpriteResourceId());
        Rect srcRect = tileMap.getSpriteSrcRect(drawUtils.getDensity());

        for (Point p : tileMap.getPoints()) {
            canvas.drawBitmap(bitmap, srcRect,
                              drawUtils.getRectangle(blockSize, horizontalPadding, verticalPadding,
                                                     p.x, p.y, DEFAULT_DENSITY), null);
        }


    }

}
