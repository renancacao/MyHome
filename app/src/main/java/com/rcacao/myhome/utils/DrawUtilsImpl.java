package com.rcacao.myhome.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

public class DrawUtilsImpl implements DrawUtils {

    private Context context;

    public DrawUtilsImpl(Context context) {
        this.context = context;
    }

    @Override
    public Bitmap createBitmap(int resourceId) {
        return BitmapFactory.decodeResource(context.getResources(), resourceId);
    }

    @Override
    public float getDensity() {
        return context.getResources().getDisplayMetrics().density;
    }

    @Override
    public Rect getRectangle(int blockSize, int horizontalPadding, int verticalPadding, int x,
                             int y, float defaultDensity) {

        return getRectangle(blockSize, 1, 1, horizontalPadding, verticalPadding, x, y,
                            defaultDensity);

    }


    @Override
    public Rect getRectangle(int blockSize, int horizontalBlocks, int verticalBlocks,
                             int horizontalPadding, int verticalPadding, int x, int y,
                             float defaultDensity) {

        int left = horizontalPadding + (x * blockSize);
        int top = verticalPadding + (y * blockSize);
        int right = (int) ((left + (blockSize * horizontalBlocks)) * defaultDensity);
        int bottom = (int) ((top + (blockSize * verticalBlocks)) * defaultDensity);

        left *= defaultDensity;
        top *= defaultDensity;

        return new Rect(left, top, right, bottom);
    }

}
