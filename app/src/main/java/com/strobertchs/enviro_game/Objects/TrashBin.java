package com.strobertchs.enviro_game.Objects;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

public class TrashBin extends GameObject {
    private Bitmap image;

    public TrashBin(int x, int y, ID id, Bitmap res) {
        super(x, y, id);
        image = res;
    }

    @Override
    public void update() {

    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap(image, x, y, null);
    }

}
