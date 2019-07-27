package com.rcacao.myhome.drawers;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;

import com.rcacao.myhome.MyApplication;
import com.rcacao.myhome.models.objectsprite.ObjectSprite;
import com.rcacao.myhome.models.objectsprite.ObjectSpritePiece;
import com.rcacao.myhome.utils.DrawUtils;

import javax.inject.Inject;

public class ObjectSpriteDrawerImpl implements TileMapDrawer {

    private static final int DEFAULT_DENSITY = 1;
    @Inject
    DrawUtils drawUtils;
    private ObjectSprite[] objectSprites;
    private int            blockSize;
    private int            horizontalPadding;
    private int            verticalPadding;

    public ObjectSpriteDrawerImpl(ObjectSprite[] objectSprites) {
        this.objectSprites = objectSprites;
        MyApplication.getDrawUtilsComponent().inject(this);

    }

    @Override
    public void draw(Canvas canvas) {

        for (ObjectSprite objectSprite : objectSprites) {
            drawObjectSprite(canvas, objectSprite);
        }

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

    private void drawObjectSprite(Canvas canvas, ObjectSprite objectSprite) {

        for (ObjectSpritePiece piece : objectSprite.getPieces()) {

            Bitmap bitmap = drawUtils.createBitmap(piece.getResourceId());
            Rect srcRect = piece.getSpriteSrcRect(drawUtils.getDensity());
            Point p = piece.getPoint();
            canvas.drawBitmap(bitmap, srcRect,
                              drawUtils.getRectangle(blockSize, horizontalPadding, verticalPadding,
                                                     p.x, p.y, DEFAULT_DENSITY), null);

        }

    }

}
