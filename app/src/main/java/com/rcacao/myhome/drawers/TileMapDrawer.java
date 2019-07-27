package com.rcacao.myhome.drawers;

import android.graphics.Canvas;

public interface TileMapDrawer {
    void draw(Canvas canvas);

    void setBlockSize(int blockSize);

    void setHorizontalPadding(int horizontalPadding);

    void setVerticalPadding(int verticalPadding);
}
