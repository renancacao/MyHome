package com.rcacao.myhome.utils;

import android.graphics.Point;
import android.graphics.Rect;

import java.util.ArrayList;
import java.util.List;

public class PointUtils {

    private PointUtils(){}

    public static List<Point> getPointsFromRect(Rect rect) {

        ArrayList<Point> points = new ArrayList<>();
        for (int i = rect.left; i <= rect.right; i++) {
            for (int j = rect.top; j <= rect.bottom; j++) {
                points.add(new Point(i, j));
            }
        }
        return points;

    }
}
