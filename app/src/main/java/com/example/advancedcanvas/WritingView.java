package com.example.advancedcanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.LayoutDirection;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WritingView extends View
{
    Paint drawColor;
    int x1, y1, x2, y2;
    Mypoint lastpoint;

    float stroke = 20f;
    int newColor = Color.GREEN;

    ArrayList<Line> lines = new ArrayList<>();


    public WritingView(Context context) {
        super(context);
        init(newColor, stroke);
    }

    public WritingView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(newColor, stroke);
    }

    // We use this method for pass runtime color and stroke values.
    public void  init(int color, float stroke) {
        drawColor = new Paint();
        drawColor.setColor(color);
        drawColor.setStrokeWidth(stroke);
        drawColor.setStyle(Paint.Style.FILL);
        drawColor.setStrokeCap(Paint.Cap.ROUND);
        drawColor.setStrokeJoin(Paint.Join.ROUND);
        drawColor.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // All things will be drawn here
        for (Line l :
             lines) {
            canvas.drawLine(l.start.x, l.start.y, l.end.x, l.end.y, l.draw);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN)
        {
            x1 = (int) event.getX();
            y1 = (int) event.getY();
            lastpoint = new Mypoint(x1, y1);
        }
        else if (event.getAction() == MotionEvent.ACTION_MOVE)
        {
            x2 = (int) event.getX();
            y2 = (int) event.getY();
            Mypoint newpoint = new Mypoint(x2, y2);
            lines.add(new Line(lastpoint, newpoint, drawColor));
            lastpoint = newpoint;
            invalidate();
        }
        else
        {}
        return true;
    }
}
