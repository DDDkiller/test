package com.example.demo.myapplication;

import android.graphics.Bitmap;

/**
 * Created by HeWenjie on 2016/6/30.
 */
public class BitmapProcessing {
    public BitmapProcessing() {}

    public BitmapProcessing(Bitmap bitmap) {
        getScanArea(bitmap);
    }

    public static Bitmap getScanArea(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap result = bitmap;
        int widthOrg = bitmap.getWidth();
        int heightOrg = bitmap.getHeight();

        int xTopLeft = 50;
        int yTopLeft = 130;
        int width = widthOrg - 2 * xTopLeft;
        int height = 50;

        try {
            result = Bitmap.createBitmap(bitmap, xTopLeft, yTopLeft, width, height);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return result;
    }
}
