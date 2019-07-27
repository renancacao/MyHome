package com.rcacao.myhome.models.sprites;

import android.graphics.Rect;

public class SpriteImpl implements Sprite {


    private final int resourceId;
    private final int width;
    private final int height;
    private final int x;
    private final int y;
    private       int horizontalBlocks = 1;
    private       int verticalBlocks   = 1;


    protected SpriteImpl(int resourceId, int width, int height, int x, int y, int horizontalBlocks,
                         int verticalBlocks) throws SpriteBadParameterException {
        this(resourceId, width, height, x, y);
        this.horizontalBlocks = horizontalBlocks;
        this.verticalBlocks = verticalBlocks;
    }

    protected SpriteImpl(int resourceId, int width, int height, int x, int y)
            throws SpriteBadParameterException {

        if (resourceId == 0) {
            throw new SpriteBadParameterException(String.format("resource ID %d", resourceId));
        }
        if (width <= 0) {
            throw new SpriteBadParameterException(String.format("width %d", width));
        }
        if (height <= 0) {
            throw new SpriteBadParameterException(String.format("height %d", height));
        }
        if (x < 0) {
            throw new SpriteBadParameterException(String.format("X value %d", x));
        }
        if (y < 0) {
            throw new SpriteBadParameterException(String.format("Y value %d", y));
        }

        this.resourceId = resourceId;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;

    }

    @Override
    public int getResourceId() {
        return resourceId;
    }


    @Override
    public Rect getSrcRect(float density) {
        int left = (int) (x * density);
        int top = (int) (y * density);
        int right = (int) ((x + width) * density);
        int bottom = (int) ((y + height) * density);

        return new Rect(left, top, right, bottom);
    }

    @Override
    public int getHorizontalBlocks() {
        return horizontalBlocks;
    }

    @Override
    public int getVerticalBlocks() {
        return verticalBlocks;
    }
}
