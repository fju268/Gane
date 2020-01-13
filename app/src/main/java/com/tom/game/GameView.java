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
   Alien alien = new Alien(this);

//    public float getPostX() {
//        return postX;
//    }
//
//    public void setPostX(float postX) {
//        if (postX > 0 && postX < getWidth()-399) {
//            this.postX = postX;
//        }
//    }
//    public float getPostY() {
//        return postY;
//    }
//
//    public void setPostY(float postY) {
//        if (postY>0&& postY<getHeight()-400) {
//            this.postY = postY;
//        }
//    }

    public  void moveRight(){
            alien.setDirection(Alien.DIRECTION_RIGHT);
    }
    public  void moveLeft(){
        alien.setDirection(Alien.DIRECTION_LEFT);
    }
    public  void moveUp(){
        alien.setDirection(Alien.DIRECTION_UP);
    }
    public  void moveDown(){
        alien.setDirection(Alien.DIRECTION_DOWN);
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
        canvas.drawBitmap(bitmap,alien.x,alien.y,paint);
    }


}

