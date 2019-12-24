package com.tom.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class GameView extends View {
    float postX , postY = 300;

    public float getPostX() {
        return postX;
    }

    public void setPostX(float postX) {
        if (postX > 0 && postX < getWidth()-399) {
            this.postX = postX;
        }
    }
    public float getPostY() {
        return postY;
    }

    public void setPostY(float postY) {
        if (postY>0&& postY<getHeight()-400) {
            this.postY = postY;
        }
    }

    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        canvas.drawLine(400,0,0,600,paint);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.alien);
        canvas.drawBitmap(bitmap,postX,postY,paint);
    }


}

