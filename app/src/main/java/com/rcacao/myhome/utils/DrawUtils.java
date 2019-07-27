package com.rcacao.myhome.utils;

import android.graphics.Bitmap;
import android.graphics.Rect;

public interface DrawUtils {

    Bitmap createBitmap(int resourceId);

    float getDensity();

    Rect getRectangle(int blockSize, int horizontalPadding, int verticalPadding, int x, int y,
                      float defaultDensity);

    Rect getRectangle(int blockSize, int horizontalBlocks, int verticalBlocks,
                      int horizontalPadding, int verticalPadding, int x, int y,
                      float defaultDensity);
}
