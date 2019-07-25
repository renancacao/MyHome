package com.rcacao.myhome.domain.sprites;

import android.graphics.Canvas;

public interface SpriteMapDrawer {
    void setBlockSize(int blockSize);

    void setHorizontalPadding(int horizontalPadding);

    void setVerticalPadding(int verticalPadding);


    void draw(Canvas canvas);
}
