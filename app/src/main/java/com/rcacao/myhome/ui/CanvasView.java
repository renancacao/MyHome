package com.rcacao.myhome.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.view.View;

import com.rcacao.myhome.models.sprites.SpriteBadParameterException;
import com.rcacao.myhome.models.tilemap.TileMap;
import com.rcacao.myhome.models.tilemap.TileMapImpl;
import com.rcacao.myhome.drawers.TileMapDrawer;
import com.rcacao.myhome.drawers.TileMapDrawerImpl;
import com.rcacao.myhome.models.tiles.CommonFloor;
import com.rcacao.myhome.models.tiles.CommonWall;
import com.rcacao.myhome.utils.PointUtils;

import java.util.ArrayList;

public class CanvasView extends View {

    public static final int           HORIZONTAL_BLOCKS = 10;
    public static final int           VERTICAL_BLOCKS   = 15;
    private             TileMapDrawer tileMapDrawer;

    public CanvasView(Context context) {
        super(context);

        prepareTest();

    }

    private void prepareTest() {

        CommonFloor commonFloor = getCommonFloor();
        ArrayList<Point> pointsFloor = new ArrayList<>();

        pointsFloor.addAll(PointUtils.getPointsFromRect(new Rect(2, 4, 4, 10)));
        pointsFloor.addAll(PointUtils.getPointsFromRect(new Rect(5, 7, 5, 10)));
        pointsFloor.addAll(PointUtils.getPointsFromRect(new Rect(6, 5, 7, 10)));

        CommonWall commonWall = getCommonWall();
        ArrayList<Point> pointsWall = new ArrayList<>();
        pointsWall.addAll(PointUtils.getPointsFromRect(new Rect(2, 2, 4, 3)));
        pointsWall.addAll(PointUtils.getPointsFromRect(new Rect(5, 5, 5, 6)));
        pointsWall.addAll(PointUtils.getPointsFromRect(new Rect(6, 3, 7, 4)));

        TileMap[] tileMaps = {new TileMapImpl(commonFloor, pointsFloor), new TileMapImpl(commonWall,
                                                                                         pointsWall)};

        tileMapDrawer = new TileMapDrawerImpl(tileMaps);

    }

    @Nullable
    private CommonFloor getCommonFloor() {
        CommonFloor commonFloor;
        try {
            commonFloor = new CommonFloor();
        } catch (SpriteBadParameterException e) {
            return null;
        }

        return commonFloor;
    }

    @Nullable
    private CommonWall getCommonWall() {
        CommonWall commonWall;
        try {
            commonWall = new CommonWall();
        } catch (SpriteBadParameterException e) {
            return null;
        }

        return commonWall;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //background
        canvas.drawColor(Color.BLACK);

        tileMapDrawer.draw(canvas);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int width = getMeasuredWidth();
        int height = getMeasuredHeight();
        int blockSize = getBlockSize(width, height);
        int horizontalPadding = getHorizontalPadding(width, blockSize);
        int verticalPadding = getVerticalPadding(height, blockSize);

        tileMapDrawer.setBlockSize(blockSize);
        tileMapDrawer.setHorizontalPadding(horizontalPadding);
        tileMapDrawer.setVerticalPadding(verticalPadding);

    }

    private int getBlockSize(int measuredWidth, int measuredHeight) {
        int blockByWidth = measuredWidth / HORIZONTAL_BLOCKS;
        int blockByHeight = measuredHeight / VERTICAL_BLOCKS;
        return Math.min(blockByHeight, blockByWidth);

    }

    private int getHorizontalPadding(int measuredSize, int blockSize) {
        return getPadding(measuredSize, blockSize, HORIZONTAL_BLOCKS);
    }

    private int getVerticalPadding(int measuredSize, int blockSize) {
        return getPadding(measuredSize, blockSize, VERTICAL_BLOCKS);
    }

    private int getPadding(int measuredSize, int blockSize, int horizontalBlocks) {
        return (measuredSize - (blockSize * horizontalBlocks)) / 2;
    }
}
