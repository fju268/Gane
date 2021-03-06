package com.tom.game;

import android.util.Log;

public class Alien extends Thread {
   public static final int  DIRECTION_RIGHT = 0;
   public static final int DIRECTION_LEFT = 1;
   public static final int DIRECTION_UP = 2;
   public static final int DIRECTION_DOWN = 3;
   public static final int DIRECTION_NULL = -1;
   int direction = DIRECTION_NULL;
   int x=0,y =0;
   private GameView gameView;
   public Alien (GameView gameView){
        this.gameView = gameView;
    }

    @Override
    public void run() {
        while (direction!=DIRECTION_NULL){
            switch (direction) {
                case DIRECTION_RIGHT:
                    if (x>=0&&x<gameView.getWidth()-450) {
                        x += 40;
                        Log.d("Right", "run: "+x);
                    }
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    gameView.invalidate();
                    break;

                case DIRECTION_LEFT:
                    if (x>0) {
                        x -= 40;
                        Log.d("Left", "run: "+x);
                    }

                        try {
                            sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        gameView.invalidate();
                        break;

                case DIRECTION_DOWN:
                    if (y>=0&&y<gameView.getHeight()-450) {
                        y += 50;
                        Log.d("Down", "run: "+y);
                    }
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    gameView.invalidate();
                    break;
                case DIRECTION_UP:
                    if (y>0) {
                        y -= 50;
                        Log.d("Up", "run: "+y);
                    }
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    gameView.invalidate();
                    break;
            }
        }
    }

        public void setDirection(int direction){
            if (this.direction ==DIRECTION_NULL){
                start();
            }
            this.direction = direction;
        }
}
