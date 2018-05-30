package com.strobertchs.enviro_game.Objects;

import android.graphics.Bitmap;
import android.support.constraint.solver.widgets.Rectangle;

import static com.strobertchs.enviro_game.MainThread.canvas;

public class TrashBin extends GameObject {
    private Bitmap image;
    private int x, y;

    public TrashBin(int x, int y, ID id, Bitmap res) {
        super(x, y, id);
        image = res;
    }

    @Override
    public void update() {

    }

    @Override
    public void draw() {
        canvas.drawBitmap(image, x, 0, null);
        if(x<0){
            canvas.drawBitmap(image, 50, 50, null);
        }
    }

    @Override
    public Rectangle getBounds() {
        return null;
    }
}