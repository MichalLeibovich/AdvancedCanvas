package com.example.advancedcanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

public class WritingView extends View
{
    Paint paint;
    int x1, y1, x2, y2;
    Mypoint lastpoint;

    public WritingView(Context context) {
        super(context);
        init();
    }

    public WritingView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public void  init() {
        paint = new Paint();
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(15f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // All things will be drawn here
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int x = (int) event.getX();
        int y = (int) event.getY();

        if (event.getAction() == MotionEvent.ACTION_DOWN)
        {}
        else if (event.getAction() == MotionEvent.ACTION_MOVE)
        {

        }
        else
        {

        }



        return super.onTouchEvent(event);
    }
}
