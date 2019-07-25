package com.rcacao.myhome.domain.sprites;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;

import com.rcacao.myhome.MyApplication;
import com.rcacao.myhome.utils.DrawUtils;

import java.util.List;

import javax.inject.Inject;

public class SpriteMapDrawerImpl implements SpriteMapDrawer {

    private static final int DEFAULT_DENSITY = 1;
    @Inject
    DrawUtils drawUtils;
    private List<SpriteMap> spriteMapList;
    private int             blockSize;
    private int             horizontalPadding;
    private int             verticalPadding;

    public SpriteMapDrawerImpl(List<SpriteMap> spriteMapList) {
        this.spriteMapList = spriteMapList;
        MyApplication.getDrawUtilsComponent().inject(this);

    }

    public SpriteMapDrawerImpl(List<SpriteMap> spriteMapList, int blockSize, int horizontalPadding,
                               int verticalPadding) {
        this.spriteMapList = spriteMapList;
        this.blockSize = blockSize;
        this.horizontalPadding = horizontalPadding;
        this.verticalPadding = verticalPadding;
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

        for (SpriteMap spriteMap : spriteMapList) {
            drawSpriteMap(canvas, spriteMap);
        }

    }

    private void drawSpriteMap(Canvas canvas, SpriteMap spriteMap) {

        Bitmap bitmap = drawUtils.createBitmap(spriteMap.getSpriteResourceId());
        Rect srcRect = spriteMap.getSpriteSrcRect(drawUtils.getDensity());

        for (Point p : spriteMap.getPoints()) {
            canvas.drawBitmap(bitmap, srcRect,
                              drawUtils.getRectangle(blockSize, horizontalPadding, verticalPadding,
                                                     p.x, p.y, DEFAULT_DENSITY), null);
        }


    }

}
